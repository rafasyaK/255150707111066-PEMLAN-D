import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var direktori = new File(".");  // direktori saat ini, ganti sesuai kebutuhan

        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();

            if (daftarFile != null && daftarFile.length > 0) {
                System.out.println("Daftar file di " + direktori.getAbsolutePath() + ":");
                for (File f : daftarFile) {
                    if (f.isFile()) {
                        System.out.println("  - " + f.getName());
                    }
                }
            } else {
                System.out.println("Direktori kosong.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
