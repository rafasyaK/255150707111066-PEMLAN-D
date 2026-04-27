package perpustakaan;
public class Buku extends Item {
    protected String isbn;
    protected int jumlahHalaman;
    protected int stok;

    public Buku(String judul, String penulis, String genre, int tahunTerbit, String isbn, int jumlahHalaman, int stok) {
        super(judul, penulis, genre, tahunTerbit);
        this.isbn = isbn;
        this.jumlahHalaman = jumlahHalaman;
        this.stok = stok;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("📚 [BUKU FISIK] " + judul + " - " + penulis + " (" + tahunTerbit + ")");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("================================");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Genre        : " + genre);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("ISBN         : " + isbn);
        System.out.println("Halaman      : " + jumlahHalaman);
        System.out.println("Stok         : " + stok);
        System.out.println("Tipe         : Buku Fisik");
        System.out.println("================================");
    }

    public int getStok() { return stok; }
}
