package model;

public final class Anggota {
    private final String nomorAnggota;
    private final String nama;
    private final JenisKeanggotaan jenisKeanggotaan;

    public Anggota(String nomorAnggota, String nama, JenisKeanggotaan jenisKeanggotaan) {
        if (nomorAnggota == null || nomorAnggota.isBlank()
                || nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nomor anggota dan nama harus diisi");
        }
        if (jenisKeanggotaan == null) {
            throw new IllegalArgumentException("Jenis keanggotaan tidak boleh null");
        }
        this.nomorAnggota = nomorAnggota;
        this.nama = nama;
        this.jenisKeanggotaan = jenisKeanggotaan;
    }

    public String getNomorAnggota() { return nomorAnggota; }
    public String getNama() { return nama; }
    public JenisKeanggotaan getJenisKeanggotaan() { return jenisKeanggotaan; }
}
