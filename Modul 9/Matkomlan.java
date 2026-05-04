// Rumus: (Tugas*0.1) + (Kuis*0.2) + (UTS*0.3) + (UAS*0.4)
public class Matkomlan extends MataKuliah {
    public Matkomlan() {
        super("Matkomlan");
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.1) + (kuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
    }
}
