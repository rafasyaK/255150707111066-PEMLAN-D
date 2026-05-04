public class Jaket {
    private final double hargaA = 100000;
    private final double hargaB = 125000;
    private final double hargaC = 175000;

    private int jumlahA;
    private int jumlahB;
    private int jumlahC;

    public void setJumlahA(int jumlahA) {
        this.jumlahA = jumlahA;
    }
    public void setJumlahB(int jumlahB) {
        this.jumlahB = jumlahB;
    }
    public void setJumlahC(int jumlahC) {
        this.jumlahC = jumlahC;
    }

    public double hitungTotalA() {
        if (jumlahA > 100) {
            return 95000 * jumlahA;
        } else {
            return hargaA * jumlahA;
        }
    }
    public double hitungTotalB() {
        if (jumlahB > 100) {
            return 120000 * jumlahB;
        } else {
            return hargaB * jumlahB;
        }
    }
    public double hitungTotalC() {
        if (jumlahC > 100) {
            return 160000 * jumlahC;
        } else {
            return hargaC * jumlahC;
        }
    }
}