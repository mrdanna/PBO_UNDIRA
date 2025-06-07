import atm.ATM;
import atm.InvalidPinException;
import atm.InsufficientBalanceException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan PIN: ");
            int inputPin = scanner.nextInt();
            atm.cekPin(inputPin);

            System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
            double jumlah = scanner.nextDouble();
            atm.tarikTunai(jumlah);

        } catch (InvalidPinException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
