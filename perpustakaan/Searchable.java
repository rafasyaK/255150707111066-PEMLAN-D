package perpustakaan;
public interface Searchable {
    boolean cariByJudul(String keyword);
    boolean cariByPenulis(String keyword);
    boolean cariByGenre(String keyword);
}
