public class Pelanggan {
    private String nama;
    private String noPelanggan;
    private String pin;
    private double saldo;
    private boolean terblokir;
    private int percobaan;

    public Pelanggan(String nama, String noPelanggan, String pin, double saldo) {
        this.nama = nama;
        this.noPelanggan = noPelanggan;
        this.pin = pin;
        this.saldo = saldo;
        this.terblokir = false;
        this.percobaan = 0;
    }

    // Getter
    public String getNama() { return nama; }
    public String getNoPelanggan() { return noPelanggan; }
    public double getSaldo() { return saldo; }
    public boolean isTerblokir() { return terblokir; }

    // Cek jenis pelanggan
    public String getJenis() {
        String kode = noPelanggan.substring(0, 2);
        if (kode.equals("38")) return "Silver";
        else if (kode.equals("56")) return "Gold";
        else if (kode.equals("74")) return "Platinum";
        else return "Tidak diketahui";
    }

    // Hitung cashback
    private double hitungCashback(double totalBelanja) {
        String kode = noPelanggan.substring(0, 2);
        double cashback = 0;

        if (totalBelanja > 1000000) {
            if (kode.equals("38")) {
                cashback = totalBelanja * 0.05;
            } else if (kode.equals("56")) {
                cashback = totalBelanja * 0.07;
            } else if (kode.equals("74")) {
                cashback = totalBelanja * 0.10;
            }
        } else {
            if (kode.equals("56")) {
                cashback = totalBelanja * 0.02;
            } else if (kode.equals("74")) {
                cashback = totalBelanja * 0.05;
            }
        }
        return cashback;
    }

    // Autentikasi
    private boolean autentikasi(String noPelanggan, String pin) {
        if (terblokir) {
            System.out.println("❌ Akun terblokir! Hubungi customer service.");
            return false;
        }
        if (this.noPelanggan.equals(noPelanggan) && this.pin.equals(pin)) {
            percobaan = 0;
            return true;
        } else {
            percobaan++;
            System.out.println("❌ No pelanggan atau PIN salah! Percobaan ke-" + percobaan + " dari 3");
            if (percobaan >= 3) {
                terblokir = true;
                System.out.println("❌ Akun diblokir karena 3x salah autentikasi!");
            }
            return false;
        }
    }

    // Beli
    public void beli(String noPelanggan, String pin, double totalBelanja) {
        if (!autentikasi(noPelanggan, pin)) return;

        double cashback = hitungCashback(totalBelanja);
        double sisaSaldo = saldo - totalBelanja + cashback;

        if (sisaSaldo < 10000) {
            System.out.println("❌ Transaksi gagal! Saldo tidak mencukupi.");
            System.out.println("   Saldo kamu: Rp " + saldo);
            System.out.println("   Saldo minimal: Rp 10.000");
            return;
        }

        saldo = sisaSaldo;
        System.out.println("✅ Pembelian berhasil!");
        System.out.println("   Total belanja  : Rp " + totalBelanja);
        if (cashback > 0) {
            System.out.println("   Cashback       : Rp " + cashback);
        }
        System.out.println("   Saldo sekarang : Rp " + saldo);
    }

    // Top up
    public void topUp(String noPelanggan, String pin, double jumlah) {
        if (!autentikasi(noPelanggan, pin)) return;

        if (jumlah <= 0) {
            System.out.println("❌ Jumlah top up harus lebih dari 0!");
            return;
        }

        saldo += jumlah;
        System.out.println("✅ Top up berhasil!");
        System.out.println("   Jumlah top up  : Rp " + jumlah);
        System.out.println("   Saldo sekarang : Rp " + saldo);
    }

    public void displayInfo() {
        System.out.println("Nama          : " + nama);
        System.out.println("No Pelanggan  : " + noPelanggan);
        System.out.println("Jenis         : " + getJenis());
        System.out.println("Saldo         : Rp " + saldo);
        System.out.println("Status        : " + (terblokir ? "Terblokir" : "Aktif"));
    }
}