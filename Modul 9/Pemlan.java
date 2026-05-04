public class Pemlan extends MataKuliah {
    public Pemlan() {
        super("Pemlan");
    }

    @Override
    public double hitungNilaiAkhir() {
        return (nilaiUts * 0.5) + (nilaiUas * 0.6);
    }
}