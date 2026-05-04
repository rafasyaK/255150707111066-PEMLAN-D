public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM() {}

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik,
                            boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) { this.nim = nim; }
    public void setIpk(double ipk) { this.ipk = ipk; }
    public String getNim()         { return nim; }
    public double getIpk()         { return ipk; }

    public double getBeasiswa() {
        if (ipk >= 3.5) return 75;
        if (ipk >= 3.0) return 50;
        return 0;
    }

    @Override
    public double getPendapatan() {
        return getTunjangan() + getBeasiswa();
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char kode = nim.charAt(6);
        String prodi;
        switch (kode) {
            case '2': prodi = "Teknik Informatika";             break;
            case '3': prodi = "Teknik Komputer";                break;
            case '4': prodi = "Sistem Informasi";               break;
            case '6': prodi = "Pendidikan Teknologi Informasi"; break;
            case '7': prodi = "Teknologi Informasi";            break;
            default:  prodi = "Tidak diketahui";
        }
        return prodi + ", " + angkatan;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "nim           : %s\n" +
                "ipk           : %.1f\n" +
                "status        : %s",
                nim, ipk, getStatus()
            );
    }
}