public class Kategori {
    String namaKategori;
    Buku[] daftarBuku;

    public Kategori(String namaKategori, Buku[] daftarBuku) {
        this.namaKategori = namaKategori;
        this.daftarBuku = daftarBuku;
    }

    public void displayKategori() {
        System.out.println("Kategori: " + namaKategori);
        System.out.println("+" + "-".repeat(22) + "+" + "-".repeat(22) + "+");
        System.out.printf("| %-20s | %-20s |\n", "Judul Buku", "Penulis");
        System.out.println("+" + "-".repeat(22) + "+" + "-".repeat(22) + "+");
        for (Buku b : daftarBuku) {
            b.displayBuku();
        }
        System.out.println("+" + "-".repeat(22) + "+" + "-".repeat(22) + "+");
        System.out.println();
    }
}