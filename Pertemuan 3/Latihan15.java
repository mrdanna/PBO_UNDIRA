/* --------------------------
Nama File : Latihan15.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat15{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
        int a, b;
            
        System.out.print("Masukan Nilai A = ");
            a = input.nextInt();
            
        // Proses
        b = ~a;
            
        System.out.println("\n");
        System.out.println("Program Ekspresi Bitwise NOT");
        System.out.println("Nilai A = " + a);
        System.out.println("Hasil ~" + a + " = " + b);
    }
}	
