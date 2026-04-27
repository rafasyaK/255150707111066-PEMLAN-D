package perpustakaan;
import java.util.ArrayList;

public class Katalog {
    private ArrayList<Item> koleksi = new ArrayList<>();

    public void tambahItem(Item item) {
        koleksi.add(item);
        System.out.println("Buku berhasil ditambahkan: " + item.getJudul());
    }

    public void tampilkanSemua() {
        if (koleksi.isEmpty()) {
            System.out.println("Katalog kosong.");
            return;
        }
        System.out.println("\n===== SEMUA KOLEKSI =====");
        for (Item item : koleksi) {
            item.tampilkanInfo();
        }
        System.out.println("=========================");
    }

    public void cariByJudul(String keyword) {
        System.out.println("\n===== HASIL PENCARIAN JUDUL: " + keyword + " =====");
        boolean ditemukan = false;
        for (Item item : koleksi) {
            if (item.cariByJudul(keyword)) {
                item.tampilkanDetail();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }

    public void cariByPenulis(String keyword) {
        System.out.println("\n===== HASIL PENCARIAN PENULIS: " + keyword + " =====");
        boolean ditemukan = false;
        for (Item item : koleksi) {
            if (item.cariByPenulis(keyword)) {
                item.tampilkanDetail();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }

    public void cariByGenre(String keyword) {
        System.out.println("\n===== HASIL PENCARIAN GENRE: " + keyword + " =====");
        boolean ditemukan = false;
        for (Item item : koleksi) {
            if (item.cariByGenre(keyword)) {
                item.tampilkanDetail();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }

    public void tampilkanBukuFisik() {
        System.out.println("\n===== BUKU FISIK =====");
        boolean ada = false;
        for (Item item : koleksi) {
            if (item instanceof Buku && !(item instanceof BukuDigital)) {
                item.tampilkanInfo();
                ada = true;
            }
        }
        if (!ada) System.out.println("Tidak ada buku fisik.");
    }

    public void tampilkanBukuDigital() {
        System.out.println("\n===== BUKU DIGITAL =====");
        boolean ada = false;
        for (Item item : koleksi) {
            if (item instanceof BukuDigital) {
                item.tampilkanInfo();
                ada = true;
            }
        }
        if (!ada) System.out.println("Tidak ada buku digital.");
    }
}
