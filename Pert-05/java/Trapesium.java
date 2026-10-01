public class Trapesium extends BangunDatar {

    private final double sisiAtas;
    private final double sisiBawah;
    private final double sisitengah;
    private final double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double sisitengah, double tinggi) {
        super("Trapesium");
        if (sisiAtas <= 0 || sisiBawah <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus > 0");
        }
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisitengah = sisitengah;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return ((sisiAtas + sisiBawah) / 2) * tinggi;
    }

    @Override
    public double keliling() {
        return sisiAtas + sisiBawah + sisitengah + tinggi; 
    }

}