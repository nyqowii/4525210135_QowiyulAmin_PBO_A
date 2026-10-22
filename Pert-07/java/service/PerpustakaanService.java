package service;

import java.util.ArrayList;
import java.util.List;
import model.Anggota;
import model.Koleksi;
import model.Peminjaman;

/**
 * Kerangka lapisan layanan.
 * Pada sesi 7 cukup struktur dan tanda tangan method; isinya boleh minimal.
 * Lapisan ini akan diperdalam pada sesi 10 (exception) dan 12 (SOLID).
 *
 * TODO: sesuaikan seluruh isi berkas ini dengan class diagram Anda sendiri.
 *       Kelas dan method di sini hanya contoh awal.
 */
public class PerpustakaanService {

    // TODO 1: tentukan bagaimana layanan ini menyimpan koleksi dan anggota.
    //         Agregasi atau komposisi? Tuliskan alasannya di analisis.md,
    //         lalu wujudkan keputusan itu di sini.
    private final List<Koleksi> koleksi = new ArrayList<>();
    private final List<Anggota> anggota = new ArrayList<>();
    private final List<Peminjaman> peminjaman = new ArrayList<>();

    public void tambahKoleksi(Koleksi koleksi) {
        if (koleksi == null) {
            throw new IllegalArgumentException("Koleksi tidak boleh null");
        }
        if (cariKoleksi(koleksi.getNomorInduk()) != null) {
            throw new IllegalArgumentException("Nomor induk koleksi sudah terdaftar");
        }
        this.koleksi.add(koleksi);
    }

    public void daftarkanAnggota(Anggota anggota) {
        if (anggota == null) {
            throw new IllegalArgumentException("Anggota tidak boleh null");
        }
        if (cariAnggota(anggota.getNomorAnggota()) != null) {
            throw new IllegalArgumentException("Nomor anggota sudah terdaftar");
        }
        this.anggota.add(anggota);
    }

    public Koleksi cariKoleksi(String nomorInduk) {
        // TODO 3
        for (Koleksi item : this.koleksi) {
            if (item.getNomorInduk().equals(nomorInduk)) {
                return item;
            }
        }
        return null;
    }

    public Peminjaman pinjam(String nomorAnggota, String nomorInduk) {
        // TODO 4: terapkan aturan bisnis dari deskripsi-kebutuhan.md.
        Anggota peminjam = cariAnggota(nomorAnggota);
        Koleksi item = cariKoleksi(nomorInduk);
        if (peminjam == null) {
            throw new IllegalArgumentException("Anggota tidak ditemukan");
        }
        if (item == null) {
            throw new IllegalArgumentException("Koleksi tidak ditemukan");
        }
        long pinjamanAktif = this.peminjaman.stream()
                .filter(p -> p.getAnggota().equals(peminjam) && !p.isDikembalikan())
                .count();
        if (pinjamanAktif >= 3) {
            throw new IllegalStateException("Anggota tidak boleh meminjam lebih dari tiga koleksi");
        }
        if (!item.bolehDipinjam()) {
            throw new IllegalStateException("Jenis koleksi ini tidak dapat dipinjam");
        }
        if (!item.tersedia()) {
            throw new IllegalStateException("Koleksi tidak tersedia untuk dipinjam");
        }

        item.kurangiStok();
        Peminjaman transaksi = new Peminjaman(peminjam, item);
        this.peminjaman.add(transaksi);
        return transaksi;
    }

    public void kembalikan(String nomorAnggota, String nomorInduk) {
        // TODO 5
        for (Peminjaman transaksi : this.peminjaman) {
            if (!transaksi.isDikembalikan()
                    && transaksi.getAnggota().getNomorAnggota().equals(nomorAnggota)
                    && transaksi.getKoleksi().getNomorInduk().equals(nomorInduk)) {
                transaksi.kembalikan();
                transaksi.getKoleksi().tambahStok();
                return;
            }
        }
        throw new IllegalArgumentException("Peminjaman aktif tidak ditemukan");
    }

    public List<Koleksi> getKoleksiDipinjam() {
        List<Koleksi> dipinjam = new ArrayList<>();
        for (Peminjaman transaksi : this.peminjaman) {
            if (!transaksi.isDikembalikan()) {
                dipinjam.add(transaksi.getKoleksi());
            }
        }
        return List.copyOf(dipinjam);
    }

    public List<Peminjaman> getRiwayatPeminjaman(String nomorAnggota) {
        if (cariAnggota(nomorAnggota) == null) {
            throw new IllegalArgumentException("Anggota tidak ditemukan");
        }
        List<Peminjaman> riwayat = new ArrayList<>();
        for (Peminjaman transaksi : this.peminjaman) {
            if (transaksi.getAnggota().getNomorAnggota().equals(nomorAnggota)) {
                riwayat.add(transaksi);
            }
        }
        return List.copyOf(riwayat);
    }

    private Anggota cariAnggota(String nomorAnggota) {
        for (Anggota item : this.anggota) {
            if (item.getNomorAnggota().equals(nomorAnggota)) {
                return item;
            }
        }
        return null;
    }
}
