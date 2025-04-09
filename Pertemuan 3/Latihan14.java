/* --------------------------
Nama File : Latihan14.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat14{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
        int x, y, hasil;
            
        System.out.print("Masukan Nilai X = ");
            x = input.nextInt();
            
        System.out.print("Masukan Nilai Y = ");
            y = input.nextInt();
            
        // Proses
        hasil = x ^ y;
            
        System.out.println("\nProgram Bitwise Log\n");
        System.out.println("Nilai X = " + x);
        System.out.println("Nilai Y = " + y);
        System.out.println("Hasil Bitwise XOR adalah " + hasil);
    }
}	
