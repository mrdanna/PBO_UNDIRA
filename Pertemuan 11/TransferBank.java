public class TransferBank implements Pembayaran {
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran via Transfer Bank: Rp" + jumlah);
    }
}
