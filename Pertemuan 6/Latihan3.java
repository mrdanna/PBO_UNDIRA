import java.util.*;

class Lat3 {    
    public static void main(String[] args) {    
        int i, j;
        int[][] data_jual = new int[3][3]; // Membuat objek array 2D

        Scanner input = new Scanner(System.in);
        
        // Menginput data jual
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Masukkan Data Jual ke [" + i + "][" + j + "] = ");
                data_jual[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Menampilkan data jual yang diinput
        System.out.println("\n\nData Jual Yang Diinput ke Elemen Array:\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Nilai Data Jual [" + i + "][" + j + "] = " + data_jual[i][j] + "\n");
            }
            System.out.println();
        }
        
        input.close(); // Menutup scanner
    }
}