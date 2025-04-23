import java.util.*;
class Lat1{
    public static void main(String[]args){
        int i;
        int[] nil_akhir;
        nil_akhir = new int [6]; //membuat objek array

        Scanner input = new Scanner(System.in);
        for (i=0; i<6; i++){
            System.out.print("Masukkan array ke"+ i +"=");
            nil_akhir[i] = input.nextInt();
        }
        System.out.println("\n\n Data Yang di input ke element array \n");
        for(i=0; i<6; i++){
            System.out.print("Nilai akhir index" + i);
            System.out.println("=" + nil_akhir[i]);
        }
    }
}