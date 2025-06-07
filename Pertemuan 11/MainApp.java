public class MainApp {
    public static void main(String[] args) {
        Pembayaran metode1 = new TransferBank();
        Pembayaran metode2 = new Ewallet();
        Pembayaran metode3 = new COD(); 

        metode1.prosesPembayaran(150000);
        metode2.prosesPembayaran(75000);
        metode3.prosesPembayaran(50000);
    }
}