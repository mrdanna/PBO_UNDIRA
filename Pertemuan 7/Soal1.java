class Lingkaran {
    double jariJari;

    // Constructor
    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas
    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling
    double keliling() {
        return 2 * Math.PI * jariJari;
    }

    // Method untuk menampilkan info
    void tampilkanInfo() {
        System.out.println("Jari-jari    : " + jariJari);
        System.out.printf("Luas         : %.2f\n", luas());
        System.out.printf("Keliling     : %.2f\n", keliling());
    }
}

// Class utama
public class Soal1 {
    public static void main(String[] args) {
        // Array untuk menyimpan beberapa objek Lingkaran
        Lingkaran[] daftarLingkaran = {
            new Lingkaran(7),
            new Lingkaran(10),
            new Lingkaran(14.5)
        };

        // Menampilkan hasil per lingkaran
        for (int i = 0; i < daftarLingkaran.length; i++) {
            System.out.println("Lingkaran ke-" + (i + 1));
            daftarLingkaran[i].tampilkanInfo();
            System.out.println();
        }
    }
}
