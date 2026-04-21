public class MainKue {
    public static void main(String[] args) {

        Kue[] kueArray = new Kue[20];

        // isi array (contoh campur)
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("KuePesanan" + i, 10000, i + 1);
            } else {
                kueArray[i] = new KueJadi("KueJadi" + i, 5000, i + 1);
            }
        }

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = kueArray[0];

        for (Kue k : kueArray) {
            System.out.println(k);
            System.out.println("Harga akhir: " + k.hitungHarga());
            System.out.println("----------------------");

            totalHarga += k.hitungHarga();

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += kp.hitungHarga();
                totalBerat += kp.getBerat();
            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += kj.hitungHarga();
                totalJumlah += kj.getJumlah();
            }

            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("\nTotal semua harga: " + totalHarga);
        System.out.println("Total harga KuePesanan: " + totalHargaPesanan);
        System.out.println("Total berat KuePesanan: " + totalBerat);
        System.out.println("Total harga KueJadi: " + totalHargaJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlah);

        System.out.println("\nKue dengan harga terbesar:");
        System.out.println(kueTermahal);
        System.out.println("Harga akhir: " + kueTermahal.hitungHarga());
    }
}