public class Lingkaran {
    // Properti radius
    private double radius;

    // Constructor menerima nilai radius
    public Lingkaran(double r) {
        radius = r;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Contoh radius
        double r = 7.0;

        // Membuat objek lingkaran dengan constructor
        Lingkaran lingkaran = new Lingkaran(r);

        // Menampilkan hasil
        System.out.println("Radius       : " + r);
        System.out.println("Luas         : " + lingkaran.hitungLuas());
        System.out.println("Keliling     : " + lingkaran.hitungKeliling());
    }
}
