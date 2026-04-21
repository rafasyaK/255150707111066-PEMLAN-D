package latihaninterface;
public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung("Kutilang", 2);
        burung.tampilkanNama();
        burung.tampilkanUmur();
        burung.makan();
        burung.berjalan();
        burung.bersuara();
    }
}
