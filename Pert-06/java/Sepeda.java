public class Sepeda implements Movable {

    @Override public void bergerak() {
        System.out.println("Sepeda melaju di jalan raya");
    }

    @Override public double kecepatanMaksimum() { return 30; } 
    
}
