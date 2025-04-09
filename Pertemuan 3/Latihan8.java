/* --------------------------
Nama File : Latihan8.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat8{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        boolean d,e,f,g;
        System.out.print("Masukan Nilai A = ");
        a =input.nextInt();
        System.out.print("Masukan Nilai B = ");
        b =input.nextInt();
        System.out.print("Masukan Nilai C = ");
        c =input.nextInt();

        //proses
        d = a + 4 < 10;
        e = b > a + 5;
        f = c - 3 >= 4;
        g = d || e || f;

        System.out.println("\n");
        System.out.println("Program Ekspresi AND");
        System.out.println("Hasil dari d = a + 4 < 10 adalah " + d);
        System.out.println("Hasil dari e = b > a + 5 adalah " + e);
        System.out.println("Hasil dari f = c - 3 - >= 4 adalah " + f);
        System.out.println("\n");
        System.out.println("Hasil dari 9 = d && e && f adalah " + g);
    }
}	
