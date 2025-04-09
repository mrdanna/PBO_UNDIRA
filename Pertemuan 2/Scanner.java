import java.util.Scanner;

public class InputScanner{
    public static void main(String [] args){
        //membuat objek baru
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel
        String nama;
        int n2;
        double n1, n3;

        System.out.print("Masukan nama anda :");
        nama = input.nextLine();

        System.out.print("Masukan nilai 1 :");
        n1 = input.nextDouble();

        System.out.print("Masukan nilai 2 :");
        n2 = input.nextInt();

        n3 = n1 + n2 ;

        System.out.println("\n Nama anda :" + nama);
        System.out.println(" Nilai anda :" + n3);
    }
}