public class MainPerpustakaan {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Clean Code", "Robert Cecil Martin",
            "Buku ini membahas cara menulis kode yang bersih rapi dan mudah dipahami oleh programmer lain");
        Buku buku2 = new Buku("Aplikasi Komputer", "Dwi Krisbiantoro",
            "Buku ini membahas penggunaan aplikasi komputer dalam kehidupan sehari hari secara praktis");
        Buku buku3 = new Buku("Laskar Pelangi", "Andrea Hirata",
            "Novel ini menceritakan perjuangan anak anak miskin di Belitung yang bersemangat dalam menuntut ilmu");

        Buku[] teknologi = {buku1, buku2};
        Buku[] fiksi = {buku3};

        Kategori k1 = new Kategori("Teknologi", teknologi);
        Kategori k2 = new Kategori("Fiksi", fiksi);

        k1.displayKategori();
        k2.displayKategori();

        // Tugas Modul 1
        System.out.println("Jumlah kata sinopsis Clean Code: " + buku1.hitungKataSinopsis());
        System.out.println("Tingkat kesamaan buku1 dan buku2: " + buku1.cekKesamaan(buku2) + "%");
        Buku hasilCopy = buku1.copy();
        System.out.println("Hasil copy buku:");
        System.out.println(hasilCopy.judul + " - " + hasilCopy.penulis);

        // Tugas Bab 3
        System.out.println("\n=== Tugas Bab 3 ===");
        buku1.simpanFile("buku.txt");
        System.out.println("File berhasil disimpan!");
        buku1.bacaFile("buku.txt");
        System.out.println("Data setelah dibaca dari file:");
        buku1.displayBuku();
        System.out.println("\nPerhitungan Royalti:");
        System.out.println("Royalti 10% : " + buku1.hitungRoyalti(100000));
        System.out.println("Royalti 20% : " + buku1.hitungRoyalti(100000, 20));
    }
}