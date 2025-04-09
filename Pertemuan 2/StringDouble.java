/* --------------------------
Nama File	: StringDouble.java
Author	: Danna
---------------------------- */
	
import java.io.*;
	
class StringFloat{	
    public static void main(String args[])throws Exception{

        //membuat objek baru
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
            
        //deklarasi variabel
        String s1, s2;
        Double n1, n2, n3;
            
        System.out.print("Masukan Nilai Pertama : ");
        s1	= input.readLine();	
                
        System.out.print("Masukan Nilai Kedua : ");
        s2	= input.readLine();	
                
        //konversi	
        n1	= Double.parseDouble(s1);
        n2	= Double.parseDouble(s2);	
                
        n3	= n1 + n2;	
                
        System.out.println("\nHasil Hitung =	" + n3);
    }		
}