public abstract class MataKuliah {
    protected String nama;
    protected int nilaiUts;
    protected int nilaiUas;

    public MataKuliah(String namaString){
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNilai(int nilaiUts, int nilaiUas) {
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    public abstract double hitungNilaiAkhir();

    public String getGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) {
            return "A";
        }else if (nilaiAkhir >= 70){
            return "B";
        }else if(nilaiAkhir >= 55){
            return "C";
        }else if(nilaiAkhir >= 40){
            return "D";
        } else {
            return "E";
        }
    }
}