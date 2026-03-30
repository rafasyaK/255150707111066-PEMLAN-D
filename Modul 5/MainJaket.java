import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket jaket = new Jaket();

        System.out.print("Masukkan jumlah jaket A : ");
        int jumlahA = in.nextInt();
        System.out.print("Masukkan jumlah jaket B : ");
        int jumlahB = in.nextInt();
        System.out.print("Masukkan jumlah jaket C : ");
        int jumlahC = in.nextInt();

        jaket.setJumlahA(jumlahA);
        jaket.setJumlahB(jumlahB);
        jaket.setJumlahC(jumlahC);

        System.out.println("Total harga jaket A : Rp " + jaket.hitungTotalA());
        System.out.println("Total harga jaket B : Rp " + jaket.hitungTotalB());
        System.out.println("Total harga jaket C : Rp " + jaket.hitungTotalC());
        System.out.println("Total keseluruhan    : Rp " + (jaket.hitungTotalA() + jaket.hitungTotalB() + jaket.hitungTotalC()));
    }
}