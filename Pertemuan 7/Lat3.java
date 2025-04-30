// Membuat class Gelas untuk merepresentasikan objek gelas
class Gelas {
    // Mendeklarasikan atribut: isi gelas dan warna gelas
    String isigelas, warnagelas;

    // Method untuk mengatur isi dan warna gelas
    void setGelas(String isi, String warna) {
        // 'this' digunakan untuk membedakan antara atribut dan parameter
        this.isigelas = isi;
        this.warnagelas = warna;
    }
}

// Class utama yang berisi method main
class Lat3 {
    public static void main(String[] args) {
        // Membuat objek dari class Gelas bernama Mug
        Gelas Mug = new Gelas();

        // Mengatur isi dan warna gelas menggunakan method setGelas
        Mug.setGelas("Coca Cola", "Putih");

        // Menampilkan hasil isi dan warna gelas ke layar
        System.out.println("Isi Gelas   : " + Mug.isigelas);
        System.out.println("Warna Gelas : " + Mug.warnagelas);
    }
}