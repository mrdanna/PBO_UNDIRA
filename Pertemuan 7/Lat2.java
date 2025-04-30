// Mengimpor library Scanner dari package java.util untuk input dari pengguna
import java.util.*;

// Membuat class Hitung
class Hitung {
    int tambah; // Variabel untuk menyimpan hasil penjumlahan

    // Method setHitung menerima dua parameter, menjumlahkannya, dan mengembalikan hasil
    int setHitung(int nil1, int nil2){
        tambah = nil1 + nil2; // Menjumlahkan nilai
        return tambah;        // Mengembalikan hasil penjumlahan
    }
}

// Class utama dengan method main
class Lat2 {
    public static void main(String[] args){
        int a, b, hasil; // Variabel untuk menyimpan input dan hasil

        // Membuat objek dari class Hitung
        Hitung ngitung = new Hitung();
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai A
        System.out.print("Masukkan Nilai A =");
        a = input.nextInt(); // Menyimpan input ke variabel a

        // Meminta pengguna untuk memasukkan nilai B
        System.out.print("Masukan Nilai B =");
        b = input.nextInt(); // Menyimpan input ke variabel b

        // Memanggil method setHitung dan menyimpan hasilnya
        hasil = ngitung.setHitung(a, b);

        // Menampilkan hasil penjumlahan ke layar
        System.out.println("Hasilnya " + hasil);
    }
}