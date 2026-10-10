public class Segitiga extends BangunDatar {

    private final double Alas;
    private final double Tinggi;
    private final double sisi;

    public Segitiga(double Alas, double Tinggi, double sisi) {
        super("Segitiga");
        // TODO 1: tolak sisi <= 0.
        if (Alas <= 0 || Tinggi <= 0 || sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus > 0");
        }
        this.Alas = Alas;
        this.Tinggi = Tinggi;
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return (Alas * Tinggi) / 2;
    }

    @Override
    public double keliling() {
        return sisi + sisi + sisi;
    }
}
