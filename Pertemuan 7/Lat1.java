// Mendefinisikan class bernama 'burung'
class burung {
    // Mendeklarasikan atribut/variabel untuk class burung
    String jenis, warna;
    int usia;
}

// Class utama yang berisi method main
class Lat1 {
    public static void main(String[] args) {
        // Membuat objek burung dengan nama 'burung_elang' dari class burung
        burung burung_elang = new burung();

        // Mengisi nilai atribut dari objek 'burung_elang'
        burung_elang.jenis = "Elang Jawa";
        burung_elang.warna = "Coklat";
        burung_elang.usia = 5;

        // Menampilkan informasi burung ke layar
        System.out.println("Jenis Burung : " + burung_elang.jenis);
        System.out.println("Warna Burung	: " + burung_elang.warna);
        System.out.println("Usia Burung	: " + burung_elang.usia + " Tahun");
    }
}

// class burung {
//     String jenis, warna;
//     int usia;

//     void tampilkanInfo() {
//         System.out.println("Jenis Burung : " + jenis);
//         System.out.println("Warna Burung : " + warna);
//         System.out.println("Usia Burung  : " + usia + " Tahun");
//     }
// }

// class Lat1 {
//     public static void main(String[] args) {
//         burung burung_elang = new burung();
//         burung_elang.jenis = "Elang Jawa";
//         burung_elang.warna = "Coklat";
//         burung_elang.usia = 5;

//         burung_elang.tampilkanInfo();
//     }
// }
