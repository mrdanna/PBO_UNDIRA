public class ContohThrow {
    public static void main(String[] args) {
        int umur = 20;

        if (umur < 18) {
            throw new IllegalArgumentException("Umur harus minimal 18 tahun");
        }

        System.out.println("Umur valid");
    }
}
