public class Tugas1 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        int A = 3, B = 6, C = 2, K = 5, L = 4, M = 3;

        // Ekspresi 1
        boolean D = (4 + 2 > A && B - 2 > 3 + 2 || B + 2 <= 6 + 2);
        System.out.println("Hasil ekspresi 1 (D) = " + D);

        // Ekspresi 2
        boolean ekspresi2 = K + 5 < M || (C * M < L && 2 * M - L > 0);
        System.out.println("Hasil ekspresi 2 = " + ekspresi2);

        // Ekspresi 3
        boolean ekspresi3 = L + 5 < M || C * K < L && 2 * K - L > 0;
        System.out.println("Hasil ekspresi 3 = " + ekspresi3);

        // Ekspresi 4
        boolean ekspresi4 = A * 4 <= 3 * M + B;
        System.out.println("Hasil ekspresi 4 = " + ekspresi4);

        // Ekspresi 5
        boolean ekspresi5 = K + 10 > A && L - 2 > 4 * C;
        System.out.println("Hasil ekspresi 5 = " + ekspresi5);
    }
}
