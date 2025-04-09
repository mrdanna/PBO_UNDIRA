/* --------------------------
Nama File : Latihan11.java
Author	: Danna
---------------------------- */
import java.util.Scanner;
public class Lat11{	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x, hasil;

        System.out.print("Masukan Nilai X = ");
        x = input.nextInt();

        // Proses
        hasil = x >> 1;

        System.out.println("\nProgram Bitwise Right\n");
        System.out.println("Nilai X = " + x);
        System.out.println("Hasil Pergeseran 1 bit kekanan adalah " + hasil);

    }
}	
