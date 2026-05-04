// Rumus: (Tugas*0.15) + (Kuis*0.25) + (UTS*0.25) + (UAS*0.35)
public class ASD extends MataKuliah {
    public ASD() {
        super("ASD");
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.15) + (kuis * 0.25) + (nilaiUts * 0.25) + (nilaiUas * 0.35);
    }
}
