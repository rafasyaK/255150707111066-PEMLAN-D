// Rumus: (Tugas*0.2) + (Kuis*0.3) + (UTS*0.2) + (UAS*0.3)
public class Probstat extends MataKuliah {
    public Probstat() {
        super("Probstat");
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.2) + (kuis * 0.3) + (nilaiUts * 0.2) + (nilaiUas * 0.3);
    }
}
