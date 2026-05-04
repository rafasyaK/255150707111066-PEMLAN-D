public class Main {
    public static void main(String[] args) {

        System.out.println("===== MANUSIA =====");
        Manusia a1 = new Manusia("Budi", "111", true,  true);
        Manusia a2 = new Manusia("Siti", "222", false, true);
        Manusia a3 = new Manusia("Andi", "333", true,  false);
        System.out.println(a1); System.out.println();
        System.out.println(a2); System.out.println();
        System.out.println(a3); System.out.println();  

        System.out.println("===== MAHASISWA FILKOM =====");
        MahasiswaFILKOM b1 = new MahasiswaFILKOM("255150707111001", 2.8, "Namamu", "nik", false, false);
        MahasiswaFILKOM b2 = new MahasiswaFILKOM("255150707111001", 3.2, "Namamu", "nik", false, false);
        MahasiswaFILKOM b3 = new MahasiswaFILKOM("255150707111001", 3.8, "Namamu", "nik", false, false);
        System.out.println(b1); System.out.println();
        System.out.println(b2); System.out.println();
        System.out.println(b3); System.out.println();

        System.out.println("===== PEKERJA =====");
        Pekerja c1 = new Pekerja(1000, 2024, 3, 2, 2,  "Tono", "666", true,  true);
        Pekerja c2 = new Pekerja(1000, 2017, 3, 2, 0,  "Wati", "777", false, false);
        Pekerja c3 = new Pekerja(1000, 2006, 3, 2, 10, "Hadi", "888", true,  true);
        System.out.println(c1); System.out.println();
        System.out.println(c2); System.out.println();
        System.out.println(c3); System.out.println();

        System.out.println("===== MANAGER =====");
        Manager d = new Manager("HRD", 7500, 2011, 1, 2, 3, "D", "111", true, true);
        System.out.println(d);
    }
}