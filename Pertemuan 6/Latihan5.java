import java.util.Scanner;

class Lat5 {    
    public static void main(String[] args) {    
        int i, j, k;
        int[][][] data_jual = new int[2][3][2];
        Scanner input = new Scanner(System.in);

        // Menginput data penjualan
        for (i = 0; i < 2; i++) { // Memperbaiki batas loop dari 10 menjadi 0
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 2; k++) {
                    System.out.println("Data Tahun ke - " + (i + 1));
                    System.out.println("Data ke - " + (j + 1) + " " + (k + 1));
                    System.out.print("Jumlah penjualan: ");
                    data_jual[i][j][k] = input.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        // Menampilkan data penjualan per tahun
        System.out.println("Data Penjualan Pertahun");
        System.out.println("-----------------------------------");
        System.out.println("Tahun    Hasil     Tahun Penjualan ke");
        System.out.println("Ke       Ke.        ------------------");
        System.out.println("                    1      2");
        System.out.println("----------------------------------------");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print((i + 1) + "\t");
                System.out.print((j + 1) + "\t\t");
                for (k = 0; k < 2; k++) {
                    System.out.print(data_jual[i][j][k] + "\t"); // Memperbaiki "\t" untuk tab
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("================================");
        input.close(); // Menutup scanner
    }    
}