class burung {
    String jenis, warna;
    int usia;

    // Constructor
    burung(String jenis, String warna, int usia) {
        this.jenis = jenis;
        this.warna = warna;
        this.usia = usia;
    }

    // Method untuk menampilkan info burung
    void tampilkanInfo() {
        System.out.println("Jenis Burung : " + jenis);
        System.out.println("Warna Burung : " + warna);
        System.out.println("Usia Burung  : " + usia + " Tahun");
    }
}

// Class utama
class array {
    public static void main(String[] args) {
        
        burung[] daftarBurung = {
            new burung("Elang Jawa", "Coklat", 5),
            new burung("Kakatua", "Putih", 3)
        };

        
        for (int i = 0; i < daftarBurung.length; i++) {
            System.out.println("Data Burung ke-" + (i + 1));
            daftarBurung[i].tampilkanInfo();
            System.out.println();
        }
    }
}
