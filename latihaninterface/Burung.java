package latihaninterface;
public class Burung implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Burung(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan biji-bijian dengan paruh");
    }
    @Override
    public void berjalan() {
        System.out.println("Bergerak dengan cara terbang");
    }
    @Override
    public void bersuara() {
        System.out.println("Berkicau merdu");
    }
    @Override
    public void tampilkanNama() {
        System.out.println("Nama burung: " + this.nama);
    }
    @Override
    public void tampilkanUmur() {
        System.out.println("Umur burung: " + this.umur + " tahun");
    }
}
