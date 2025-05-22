package Latpack;
public class Lat1004 {
    public static void main(String[] args) {
        Paket1 objekPaket1 = new Paket1();
        objekPaket1.info();
        System.out.println("Nilai A = " + objekPaket1.a); // ⚠️ Mungkin error tergantung access modifier

        Paket2 objekPaket2 = new Paket2();
        objekPaket2.info();
    }
}