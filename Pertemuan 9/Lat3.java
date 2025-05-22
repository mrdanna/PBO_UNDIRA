class Perhitungan {
    // Method overload pertama: penjumlahan dua bilangan integer
    public static int hitung(int a, int b) {
        return a + b;
    }

    // Method overload kedua: pembagian dari jumlah dua bilangan double dibagi bilangan ketiga
    public static double hitung(double a, double b, double c) {
        return (a + b) / c;
    }
}

public class Lat3 {
    public static void main(String[] args) {
        // Pemanggilan method static tidak perlu instansiasi
        int hitung = Perhitungan.hitung(4, 8);
        double bagi = Perhitungan.hitung(55, 69, 2);

        System.out.println("Hasil Perhitungan = " + hitung);
        System.out.println("Hasil Pembagian   = " + bagi);
    }
}