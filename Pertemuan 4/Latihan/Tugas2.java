import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk, ukuran;
        int harga = 0;

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");
        System.out.println("A. Susu Dancow");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println();

        // Input merk dan ukuran
        System.out.print("Masukan Merk Susu [Dancow | Bendera | SGM] : ");
        merk = input.nextLine().trim();

        System.out.print("Masukan Ukuran Kaleng [Kecil|Sedang|Besar] : ");
        ukuran = input.nextLine().trim();

        // Menentukan harga satuan berdasarkan merk dan ukuran
        if (merk.equalsIgnoreCase("Dancow")) {
            if (ukuran.equalsIgnoreCase("Kecil")) {
                harga = 25000;
            } else if (ukuran.equalsIgnoreCase("Sedang")) {
                harga = 20000;
            } else if (ukuran.equalsIgnoreCase("Besar")) {
                harga = 15000;
            }
        } else if (merk.equalsIgnoreCase("Bendera")) {
            if (ukuran.equalsIgnoreCase("Kecil")) {
                harga = 20000;
            } else if (ukuran.equalsIgnoreCase("Sedang")) {
                harga = 17500;
            } else if (ukuran.equalsIgnoreCase("Besar")) {
                harga = 13500;
            }
        } else if (merk.equalsIgnoreCase("SGM")) {
            if (ukuran.equalsIgnoreCase("Kecil")) {
                harga = 22000;
            } else if (ukuran.equalsIgnoreCase("Sedang")) {
                harga = 18500;
            } else if (ukuran.equalsIgnoreCase("Besar")) {
                harga = 15000;
            }
        } else {
            System.out.println("Merk susu tidak dikenali.");
            return;
        }

        System.out.println("Harga Satuan Barang Rp. " + harga);

        // Input jumlah beli
        System.out.print("Jumlah Yang dibeli : ");
        int jumlah = input.nextInt();

        // Hitung total bayar
        int totalBayar = harga * jumlah;

        System.out.println("Harga Yang Harus dibayar Sebesar Rp. " + totalBayar);
    }
}

