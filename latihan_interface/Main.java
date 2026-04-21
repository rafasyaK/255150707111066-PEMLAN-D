package latihaninterface;
public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        System.out.println("---");

        Hewan hewan = new Hewan();
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();
    }
}