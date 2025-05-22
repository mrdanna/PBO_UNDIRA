class MatematikaLanjutan extends Matematika {
    public int kuadratKali() {
        // Memanggil method dari parent class
        return kali() * kali();
    }

    // Titik masuk program
    public static void main(String[] args) {
        MatematikaLanjutan obj = new MatematikaLanjutan();

        System.out.println("Hasil Tambah: " + obj.tambah());      // dari Matematika
        System.out.println("Hasil Kali: " + obj.kali());          // dari Matematika
        System.out.println("Hasil Kuadrat Kali: " + obj.kuadratKali()); // dari MatematikaLanjutan
    }
}