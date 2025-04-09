/* --------------------------
Nama File : Latihan2.java
Author	: Danna
---------------------------- */
	
import java.util.*;

public class Lat2{	
    public static void main(String[] args){	
        int nil1, nil2;
        int a, b, c, d, e, f;
        Scanner input = new Scanner(System.in);
            
        System.out.print("Masukan Nilai Pertama = ");
            nil1 = input.nextInt();
        System.out.print("Masukan Nilai Kedua = ");
            nil2 = input.nextInt();
            
        //operasi aritmatika
        a = nil1 * nil2;
        b = nil1 / nil2;
        c = nil1 % nil2;
        d = nil1 + nil2;
        e = nil1 - nil2;
            
        System.out.println("Hasil " + nil1 + " * " + nil2 + " = " + a);
        System.out.println("Hasil " + nil1 + " / " + nil2 + " = " + b);
        System.out.println("Hasil " + nil1 + " % " + nil2 + " = " + c);
        System.out.println("Hasil " + nil1 + " + " + nil2 + " = " + d);
        System.out.println("Hasil " + nil1 + " - " + nil2 + " = " + e);
    }	
}	
