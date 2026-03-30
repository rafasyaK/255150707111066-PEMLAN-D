public class MainSwalayan {
    public static void main(String[] args) {

        // Buat pelanggan
        Pelanggan p1 = new Pelanggan("Rafasya", "3812345678", "1234", 5000000);
        Pelanggan p2 = new Pelanggan("Budi", "5687654321", "5678", 3000000);
        Pelanggan p3 = new Pelanggan("Citra", "7412345678", "9012", 8000000);

        // Info pelanggan
        System.out.println("===== INFO PELANGGAN =====");
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();
        p3.displayInfo();

        // Transaksi Silver
        System.out.println("\n===== TRANSAKSI SILVER (Rafasya) =====");
        p1.beli("3812345678", "1234", 1500000); // cashback 5%
        p1.beli("3812345678", "1234", 500000);  // tidak ada cashback

        // Transaksi Gold
        System.out.println("\n===== TRANSAKSI GOLD (Budi) =====");
        p2.beli("5687654321", "5678", 2000000); // cashback 7%
        p2.beli("5687654321", "5678", 800000);  // cashback 2%

        // Transaksi Platinum
        System.out.println("\n===== TRANSAKSI PLATINUM (Citra) =====");
        p3.beli("7412345678", "9012", 3000000); // cashback 10%
        p3.beli("7412345678", "9012", 500000);  // cashback 5%

        // Top up
        System.out.println("\n===== TOP UP =====");
        p1.topUp("3812345678", "1234", 1000000);

        // Saldo tidak cukup
        System.out.println("\n===== SALDO TIDAK CUKUP =====");
        p1.beli("3812345678", "1234", 10000000);

        // Blokir akun
        System.out.println("\n===== UJI BLOKIR AKUN =====");
        p1.beli("3812345678", "salah1", 100000);
        p1.beli("3812345678", "salah2", 100000);
        p1.beli("3812345678", "salah3", 100000);
        p1.beli("3812345678", "1234", 100000); // sudah terblokir
    }
}
