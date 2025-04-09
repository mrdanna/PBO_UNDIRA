import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI RATA-RATA\n");

        // Input data
        System.out.print("Nama Siswa\t\t\t: ");
        String nama = input.nextLine();

        System.out.print("Nilai Pertandingan I\t\t: ");
        double nilai1 = input.nextDouble();

        System.out.print("Nilai Pertandingan II\t\t: ");
        double nilai2 = input.nextDouble();

        System.out.print("Nilai Pertandingan III\t\t: ");
        double nilai3 = input.nextDouble();

        // Proses hitung rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menentukan hadiah
        String hadiah;
        if (rataRata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        } else if (rataRata >= 70) {
            hadiah = "Uang sebesar Rp. 500,000";
        } else {
            hadiah = "Hadiah Hiburan";
        }

        // Output
        System.out.println("\nSiswa yang bernama " + nama);
        System.out.printf("Memperoleh nilai rata-rata %.2f dari hasil perlombaan yang diikutinya.\n", rataRata);
        System.out.println("Mendapat hadiah: " + hadiah);
    }
}
