import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws LimitException {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        while (true) {
            System.out.println("Введите комманду 1) Остаток 2) Положить на счет 3) Снять со счета");
            try {
                int command = scanner.nextInt();
                if (command == 1) {
                    System.out.println(bankAccount.getAmount());
                } else if (command == 2) {
                    try {
                        bankAccount.deposit(0);
                    }
                    catch (SumException ie){
                        System.out.println(ie.getMessage());
                    }
                } else if (command == 3) {
                    try {
                        bankAccount.withDraw(0);

                    }
                    catch (SumException ie){
                        System.out.println(ie.getMessage());
                    }
                    catch (LimitException ie) {
                        System.out.println(ie.getMessage());
                        bankAccount.setAmount(bankAccount.getAmount() - bankAccount.getAmount());
                        System.out.println("Остаток по карте " + bankAccount.getAmount());
                        break;
                    }
                } else {
                    System.out.println("Комманда не найдена");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Вы ввели неверное значение");
                scanner.next();
            }
        }
    }
}