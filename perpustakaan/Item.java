package perpustakaan;
public abstract class Item implements Searchable, Displayable {
    protected String judul;
    protected String penulis;
    protected String genre;
    protected int tahunTerbit;

    public Item(String judul, String penulis, String genre, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public boolean cariByJudul(String keyword) {
        return judul.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public boolean cariByPenulis(String keyword) {
        return penulis.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public boolean cariByGenre(String keyword) {
        return genre.toLowerCase().contains(keyword.toLowerCase());
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public String getGenre() { return genre; }
    public int getTahunTerbit() { return tahunTerbit; }
}
