/* --------------------------
Nama File : Latihan10.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat10{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x, hasil;

        System.out.print("Masukan Nilai X = ");
        x = input.nextInt();

        // Proses
        hasil = x << 1;

        System.out.println("\nProgram Bitwise Left\n");
        System.out.println("Nilai X = " + x);
        System.out.println("Hasil Pergeseran 1 bit kekiri adalah " + hasil);
    }
}	
