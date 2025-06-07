public class ContohThrowsFungsi {

    // Fungsi ini melempar eksepsi jika umur kurang dari 18
    public static void validasiUmur(int umur) throws Exception {
        if (umur < 18) {
            throw new Exception("Umur tidak valid: harus minimal 18 tahun");
        }
    }

    public static void main(String[] args) {
        try {
            validasiUmur(16); // Ini akan menimbulkan eksepsi
            System.out.println("Umur valid.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
