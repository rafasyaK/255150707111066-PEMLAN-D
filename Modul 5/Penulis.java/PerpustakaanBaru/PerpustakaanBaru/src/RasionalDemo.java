public class RasionalDemo {

    public static void main(String[] args){

        Rasional R1 = new Rasional(1,2);
        Rasional R2 = new Rasional(3,4);

        System.out.print("R1 = ");
        R1.tampil();

        System.out.print("R2 = ");
        R2.tampil();

        Rasional r3 = new Rasional(1,2);
        r3.tambah(R2);
        System.out.print("R1 + R2 = ");
        r3.tampil();

        Rasional r4 = new Rasional(1,2);
        r4.minus(R2);
        System.out.print("R1 - R2 = ");
        r4.tampil();

        Rasional r5 = new Rasional(1,2);
        r5.kali(R2);
        System.out.print("R1 * R2 = ");
        r5.tampil();

        Rasional r6 = new Rasional(1,2);
        r6.bagi(R2);
        System.out.print("R1 / R2 = ");
        r6.tampil();
    }
}