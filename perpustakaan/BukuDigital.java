package perpustakaan;
public class BukuDigital extends Buku {
    private String formatFile;
    private double ukuranMB;
    private String linkDownload;

    public BukuDigital(String judul, String penulis, String genre, int tahunTerbit, String isbn, int jumlahHalaman, String formatFile, double ukuranMB, String linkDownload) {
        super(judul, penulis, genre, tahunTerbit, isbn, jumlahHalaman, 999);
        this.formatFile = formatFile;
        this.ukuranMB = ukuranMB;
        this.linkDownload = linkDownload;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("💻 [BUKU DIGITAL] " + judul + " - " + penulis + " (" + tahunTerbit + ") [" + formatFile + "]");
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
        System.out.println("Format       : " + formatFile);
        System.out.println("Ukuran       : " + ukuranMB + " MB");
        System.out.println("Link         : " + linkDownload);
        System.out.println("Tipe         : Buku Digital");
        System.out.println("================================");
    }
}
