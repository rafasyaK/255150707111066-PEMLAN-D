package tugaspraktikum;
public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public Integer getTotalBelanja() {
        int total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return total;
    }

    @Override
    public int getPayableAmount() {
        return salaryPerMonth - getTotalBelanja();
    }

    public void tampilkanInfo() {
        System.out.println("=================================");
        System.out.println("No. Registrasi : " + registrationNumber);
        System.out.println("Nama           : " + name);
        System.out.println("Gaji Per Bulan : Rp" + salaryPerMonth);
        System.out.println("---------------------------------");
        System.out.println("Detail Belanja di Koperasi:");
        for (Payable p : invoices) {
            ((Invoice) p).tampilkanDetail();
        }
        System.out.println("Total Belanja  : Rp" + getTotalBelanja());
        System.out.println("Gaji Diterima  : Rp" + getPayableAmount());
        System.out.println("=================================");
    }
}