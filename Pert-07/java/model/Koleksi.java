package model;

public abstract class Koleksi {
    private final String nomorInduk;
    private final String judul;
    private final String penulis;
    private final int tahun;
    private int jumlahEksemplar;
    private StatusKoleksi status = StatusKoleksi.TERSEDIA;

    protected Koleksi(String nomorInduk, String judul, String penulis,
                      int tahun, int jumlahEksemplar) {
        if (nomorInduk == null || nomorInduk.isBlank()
                || judul == null || judul.isBlank()
                || penulis == null || penulis.isBlank()) {
            throw new IllegalArgumentException("Identitas koleksi harus diisi");
        }
        if (jumlahEksemplar < 0) {
            throw new IllegalArgumentException("Jumlah eksemplar tidak boleh negatif");
        }
        this.nomorInduk = nomorInduk;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.jumlahEksemplar = jumlahEksemplar;
    }

    public abstract int masaPinjamHari();
    public abstract boolean bolehDipinjam();

    public boolean tersedia() {
        return status == StatusKoleksi.TERSEDIA && jumlahEksemplar > 0;
    }

    public void kurangiStok() {
        if (!bolehDipinjam()) {
            throw new IllegalStateException("Koleksi ini tidak dapat dipinjam");
        }
        if (!tersedia()) {
            throw new IllegalStateException("Stok koleksi tidak tersedia");
        }
        jumlahEksemplar--;
        if (jumlahEksemplar == 0) {
            status = StatusKoleksi.DIPINJAM;
        }
    }

    public void tambahStok() {
        jumlahEksemplar++;
        if (status == StatusKoleksi.DIPINJAM) {
            status = StatusKoleksi.TERSEDIA;
        }
    }

    public void setStatus(StatusKoleksi status) {
        if (status == null) {
            throw new IllegalArgumentException("Status koleksi tidak boleh null");
        }
        this.status = status;
    }

    public String getNomorInduk() { return nomorInduk; }
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahun() { return tahun; }
    public int getJumlahEksemplar() { return jumlahEksemplar; }
    public StatusKoleksi getStatus() { return status; }
}
