public class Dosen extends PegawaiTetap {
    private final double tunjanganFungsional;

    public Dosen(String nip, String nama, double gajiPokok, int masaKerja, double tunjanganFungsional) {
        super(nip, nama, gajiPokok, masaKerja);
        
        this.tunjanganFungsional = tunjanganFungsional;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganFungsional;
    }

    @Override
    public String jenis() {
        return "Dosen";
    }

    @Override 
    protected int getMasaKerjaTahun() {
        return super.getMasaKerjaTahun();
    }

}
