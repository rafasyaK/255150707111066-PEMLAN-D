public class Rasional {

    int pembilang;
    int penyebut;

    public Rasional(int p, int q){
        pembilang = p;
        penyebut = q;
    }

    public void tampil(){
        System.out.println(pembilang + "/" + penyebut);
    }

    public void tambah(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    public void minus(Rasional A){
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    public void kali(Rasional A){
        pembilang = pembilang * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    public void bagi(Rasional A){
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }
}