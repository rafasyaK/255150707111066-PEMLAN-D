package perpustakaan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Katalog katalog = new Katalog();
        Scanner sc = new Scanner(System.in);

        // Data awal
        katalog.tambahItem(new Buku("Laskar Pelangi", "Andrea Hirata", "Novel", 2005, "978-979-1997-23-1", 529, 5));
        katalog.tambahItem(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "Novel", 1980, "978-979-407-180-1", 400, 3));
        katalog.tambahItem(new Buku("Algoritma Pemrograman", "Rinaldi Munir", "Teknologi", 2011, "978-602-8984-24-1", 300, 4));
        katalog.tambahItem(new BukuDigital("Clean Code", "Robert C. Martin", "Teknologi", 2008, "978-0-13-235088-4", 431, "PDF", 12.5, "https://example.com/cleancode.pdf"));
        katalog.tambahItem(new BukuDigital("The Pragmatic Programmer", "David Thomas", "Teknologi", 1999, "978-0-201-61622-4", 352, "EPUB", 8.3, "https://example.com/pragmatic.epub"));

        boolean running = true;
        while (running) {
            System.out.println("\n===== PERPUSTAKAAN DIGITAL =====");
            System.out.println("1. Tampilkan Semua Koleksi");
            System.out.println("2. Cari Buku by Judul");
            System.out.println("3. Cari Buku by Penulis");
            System.out.println("4. Cari Buku by Genre");
            System.out.println("5. Tampilkan Buku Fisik");
            System.out.println("6. Tampilkan Buku Digital");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    katalog.tampilkanSemua();
                    break;
                case 2:
                    System.out.print("Masukkan judul: ");
                    katalog.cariByJudul(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Masukkan nama penulis: ");
                    katalog.cariByPenulis(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Masukkan genre: ");
                    katalog.cariByGenre(sc.nextLine());
                    break;
                case 5:
                    katalog.tampilkanBukuFisik();
                    break;
                case 6:
                    katalog.tampilkanBukuDigital();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        sc.close();
    }
}
