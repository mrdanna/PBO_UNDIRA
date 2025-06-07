package atm;

public class ATM {
    private int pin = 1234;
    private double saldo = 500_000;

    public void cekPin(int inputPin) throws InvalidPinException {
        if (inputPin != pin) {
            throw new InvalidPinException("PIN yang Anda masukkan salah!");
        }
    }

    public void tarikTunai(double jumlah) throws InsufficientBalanceException {
        if (jumlah > saldo) {
            throw new InsufficientBalanceException("Saldo tidak cukup!");
        }
        saldo -= jumlah;
        System.out.println("Penarikan berhasil. Sisa saldo: Rp" + saldo);
    }
}
