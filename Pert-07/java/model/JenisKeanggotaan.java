package model;

public final class JenisKeanggotaan {
    public static final JenisKeanggotaan MAHASISWA =
            new JenisKeanggotaan("Mahasiswa", 1_000);
    public static final JenisKeanggotaan DOSEN =
            new JenisKeanggotaan("Dosen", 500);
    public static final JenisKeanggotaan KEHORMATAN =
            new JenisKeanggotaan("Anggota kehormatan", 0);

    private final String nama;
    private final long dendaPerHari;

    public JenisKeanggotaan(String nama, long dendaPerHari) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama jenis keanggotaan harus diisi");
        }
        if (dendaPerHari < 0) {
            throw new IllegalArgumentException("Denda per hari tidak boleh negatif");
        }
        this.nama = nama;
        this.dendaPerHari = dendaPerHari;
    }

    public String getNama() { return nama; }
    public long getDendaPerHari() { return dendaPerHari; }
}
