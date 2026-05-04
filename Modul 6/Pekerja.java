import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja() {}

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji)         { this.gaji = gaji; }
    public void setTahunMasuk(LocalDate tgl) { this.tahunMasuk = tgl; }
    public void setJumlahAnak(int n)         { this.jumlahAnak = n; }
    public double getGajiPokok()             { return gaji; }
    public LocalDate getTahunMasuk()         { return tahunMasuk; }
    public int getJumlahAnak()               { return jumlahAnak; }

    public int getLamaBekerja() {
        return LocalDate.now().getYear() - tahunMasuk.getYear();
    }

    public double getBonus() {
        int lama = getLamaBekerja();
        if (lama > 10)      return gaji * 0.15;
        else if (lama >= 6) return gaji * 0.10;
        else                return gaji * 0.05;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20);
    }

    public double getGaji() {
        return gaji + getBonus() + getTunjangan();
    }

    @Override
    public double getPendapatan() {
        return getGaji();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "tahun masuk   : %d %d %d\n" +
                "jumlah anak   : %d\n" +
                "gaji          : %.1f",
                tahunMasuk.getDayOfMonth(),
                tahunMasuk.getMonthValue(),
                tahunMasuk.getYear(),
                jumlahAnak,
                gaji
            );
    }
}