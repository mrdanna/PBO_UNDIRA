/* --------------------------
Nama File : Latihan3.java
Author	: Danna
---------------------------- */
	
import java.util.*;
class Lat3{	
    public static void main(String[] args){	
        int pendapatan;
        double jasa, komisi, total;

        //deklasari objek
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pendapatan sales Rp.");
        pendapatan = input.nextInt();

        if(pendapatan >= 0 && pendapatan <= 200000){
            jasa = 10000;
            komisi = 0.1 * pendapatan;
        }else{
            if(pendapatan <= 500000){
                jasa = 20000;
                komisi = 0.15 * pendapatan;
            }else{
                jasa = 30000;
                komisi = 0.2 * pendapatan;
            }
        }
        //menghitung
        total = komisi + jasa;

        System.out.println("\n Uang jasa Rp. " + (int) jasa);
        System.out.println("\n Uang Komisi Rp. " + (int) komisi);
        System.out.println("====================================");
        System.out.println("\n Uang Total Rp. " + (int) total);
    }	
}	
	