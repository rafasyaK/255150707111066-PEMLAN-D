package tugaspraktikum;
public class Main {
    public static void main(String[] args) {
        Invoice[] invoicesBudi = {
            new Invoice("Beras 5kg", 2, 75000),
            new Invoice("Minyak Goreng", 3, 20000),
            new Invoice("Sabun Mandi", 5, 8000)
        };

        Invoice[] invoicesRini = {
            new Invoice("Gula 1kg", 4, 15000),
            new Invoice("Teh Celup", 2, 12000)
        };

        Employee[] karyawan = {
            new Employee(1001, "Budi Santoso", 5000000, invoicesBudi),
            new Employee(1002, "Rini Anggraini", 4500000, invoicesRini)
        };

        for (Payable p : karyawan) {
            ((Employee) p).tampilkanInfo();
        }
    }
}