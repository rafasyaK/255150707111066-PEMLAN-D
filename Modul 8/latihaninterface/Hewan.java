package latihaninterface;
public class Hewan implements MakhlukHidup, Identitas {
    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }
    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }
    @Override
    public void tampilkanNama() {
        System.out.println("Nama hewan: tidak diketahui");
    }
    @Override
    public void tampilkanUmur() {
        System.out.println("Umur hewan: tidak diketahui");
    }
}
