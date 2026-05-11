import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var direktori = new File("folder_test");  // ganti sesuai kebutuhan

        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();

            if (daftarFile != null) {
                for (File f : daftarFile) {
                    boolean berhasil = f.delete();
                    System.out.println((berhasil ? "Berhasil" : "Gagal")
                        + " menghapus file: " + f.getName());
                }
            }

            boolean hapusDirektori = direktori.delete();
            System.out.println((hapusDirektori ? "Berhasil" : "Gagal")
                + " menghapus direktori: " + direktori.getName());
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
