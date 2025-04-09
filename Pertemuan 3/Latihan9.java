/* --------------------------
Nama File : Latihan9.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat9{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a;
        boolean b, c;

        System.out.print("Masukan Nilai A = ");
        a = input.nextInt();

        // Proses
        b = a + 4 < 10;
        c = !(b);

        System.out.println("\n");
        System.out.println("Program Ekspresi NOT");
        System.out.println("Nilai A = " + a);
        System.out.println("Hasil dari b = a + 4 < 10 adalah " + b);
        System.out.println("Hasil dari c = !(b) adalah " + c);
    }
}	
