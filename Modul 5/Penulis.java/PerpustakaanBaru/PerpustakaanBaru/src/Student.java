public class Student {

    static int jumlah = 0;

    public Student(){
        jumlah++;
    }

    public static void jumlahObjek(){
        System.out.println("Jumlah objek Student : " + jumlah);
    }
}