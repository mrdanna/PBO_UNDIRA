/* --------------------------
Nama File : Latihan12.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat12{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
        int x, y, hasil;
            
        System.out.print("Masukan Nilai X = ");
            x = input.nextInt();
            
        System.out.print("Masukan Nilai Y = ");
            y = input.nextInt();
            
        // Proses
        hasil = x & y;
            
        System.out.println("\nProgram Bitwise And\n");
        System.out.println("Nilai X = " + x);
        System.out.println("Nilai Y = " + y);
        System.out.println("Hasil Bitwise AND adalah " + hasil);
    }
}	
