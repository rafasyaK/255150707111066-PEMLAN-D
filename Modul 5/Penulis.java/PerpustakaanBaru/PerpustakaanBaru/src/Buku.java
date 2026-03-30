import java.io.*;

public class Buku {
    String judul;
    String penulis;
    String sinopsis;

    public Buku(String judul, String penulis, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public void displayBuku() {
        System.out.printf("| %-20s | %-20s |\n", judul, penulis);
    }

    public int hitungKataSinopsis() {
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }

    public double cekKesamaan(Buku other) {
        int sama = 0;
        int total = 3;
        if (this.judul.equalsIgnoreCase(other.judul)) sama++;
        if (this.penulis.equalsIgnoreCase(other.penulis)) sama++;
        if (this.sinopsis.equalsIgnoreCase(other.sinopsis)) sama++;
        return (sama / (double) total) * 100;
    }

    public Buku copy() {
        return new Buku(this.judul, this.penulis, this.sinopsis);
    }

    public void bacaFile(String pathFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String data = br.readLine();
            String[] bagian = data.split(";");
            judul = bagian[0];
            penulis = bagian[1];
            sinopsis = bagian[2];
            br.close();
        } catch (Exception e) {
            System.out.println("Error membaca file");
        }
    }

    public void simpanFile(String namaFile) {
        try {
            FileWriter fw = new FileWriter(namaFile);
            fw.write(judul + ";" + penulis + ";" + sinopsis);
            fw.close();
        } catch (Exception e) {
            System.out.println("Error menyimpan file");
        }
    }

    public double hitungRoyalti(double harga) {
        return harga * 0.10;
    }

    public double hitungRoyalti(double harga, double persen) {
        return harga * persen / 100;
    }
}