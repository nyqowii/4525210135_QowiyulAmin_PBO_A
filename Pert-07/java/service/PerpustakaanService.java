package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import model.Buku;

/**
 * Layanan peminjaman sederhana untuk model Buku pada sesi 7.
 * Lapisan ini akan diperdalam pada sesi 10 (exception) dan 12 (SOLID).
 */
public class PerpustakaanService {

    private final List<Buku> koleksi = new ArrayList<>();
    private final Set<String> anggota = new HashSet<>();
    private final Map<String, Set<String>> peminjamanAktif = new HashMap<>();

    public void daftarkanAnggota(String nomorAnggota) {
        if (nomorAnggota == null || nomorAnggota.isBlank()) {
            throw new IllegalArgumentException("Nomor anggota tidak boleh kosong");
        }
        if (!anggota.add(nomorAnggota)) {
            throw new IllegalArgumentException("Anggota sudah terdaftar");
        }
    }

    public void tambahKoleksi(Buku buku) {
        if (buku == null) {
            throw new IllegalArgumentException("Buku tidak boleh null");
        }
        if (cariKoleksi(buku.getNomorInduk()) != null) {
            throw new IllegalArgumentException("Nomor induk buku sudah terdaftar");
        }
        koleksi.add(buku);
    }

    public Buku cariKoleksi(String nomorInduk) {
        for (Buku buku : koleksi) {
            if (buku.getNomorInduk().equals(nomorInduk)) {
                return buku;
            }
        }
        return null;
    }

    public void pinjam(String nomorAnggota, String nomorInduk) {
        if (!anggota.contains(nomorAnggota)) {
            throw new IllegalArgumentException("Anggota belum terdaftar");
        }
        Buku buku = cariKoleksi(nomorInduk);
        if (buku == null) {
            throw new IllegalArgumentException("Buku tidak ditemukan");
        }
        Set<String> pinjamanAnggota = peminjamanAktif.computeIfAbsent(
                nomorAnggota, k -> new HashSet<>());
        if (pinjamanAnggota.size() >= 3) {
            throw new IllegalStateException("Anggota tidak boleh meminjam lebih dari tiga buku");
        }
        if (pinjamanAnggota.contains(nomorInduk)) {
            throw new IllegalStateException("Buku ini sudah dipinjam oleh anggota");
        }
        buku.kurangiStok();
        pinjamanAnggota.add(nomorInduk);
    }

    public void kembalikan(String nomorAnggota, String nomorInduk) {
        Set<String> pinjamanAnggota = peminjamanAktif.get(nomorAnggota);
        if (pinjamanAnggota == null || !pinjamanAnggota.remove(nomorInduk)) {
            throw new IllegalArgumentException("Peminjaman aktif tidak ditemukan");
        }
        Buku buku = cariKoleksi(nomorInduk);
        if (buku == null) {
            pinjamanAnggota.add(nomorInduk);
            throw new IllegalStateException("Buku yang dipinjam tidak lagi terdaftar");
        }
        buku.tambahStok();
    }
}
