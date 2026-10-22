package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class Peminjaman {
    private final Anggota anggota;
    private final Koleksi koleksi;
    private final LocalDate tanggalPinjam;
    private final LocalDate tanggalJatuhTempo;
    private LocalDate tanggalKembali;

    public Peminjaman(Anggota anggota, Koleksi koleksi) {
        if (anggota == null || koleksi == null) {
            throw new IllegalArgumentException("Anggota dan koleksi harus diisi");
        }
        if (!koleksi.bolehDipinjam()) {
            throw new IllegalArgumentException("Koleksi ini tidak dapat dipinjam");
        }
        this.anggota = anggota;
        this.koleksi = koleksi;
        this.tanggalPinjam = LocalDate.now();
        this.tanggalJatuhTempo = tanggalPinjam.plusDays(koleksi.masaPinjamHari());
    }

    public long hitungDenda(LocalDate tanggal) {
        if (tanggal == null) {
            throw new IllegalArgumentException("Tanggal penghitungan denda harus diisi");
        }
        long hariTerlambat = Math.max(0, ChronoUnit.DAYS.between(tanggalJatuhTempo, tanggal));
        return hariTerlambat * anggota.getJenisKeanggotaan().getDendaPerHari();
    }

    public void kembalikan() {
        kembalikan(LocalDate.now());
    }

    public void kembalikan(LocalDate tanggal) {
        if (tanggal == null || tanggal.isBefore(tanggalPinjam)) {
            throw new IllegalArgumentException("Tanggal kembali tidak valid");
        }
        if (isDikembalikan()) {
            throw new IllegalStateException("Peminjaman sudah dikembalikan");
        }
        this.tanggalKembali = tanggal;
    }

    public Anggota getAnggota() { return anggota; }
    public Koleksi getKoleksi() { return koleksi; }
    public LocalDate getTanggalPinjam() { return tanggalPinjam; }
    public LocalDate getTanggalJatuhTempo() { return tanggalJatuhTempo; }
    public LocalDate getTanggalKembali() { return tanggalKembali; }
    public boolean isDikembalikan() { return tanggalKembali != null; }
}
