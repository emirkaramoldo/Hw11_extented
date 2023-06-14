import java.util.Scanner;
public class BankAccount {
    private double amount;

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        System.out.println("Введите сумму вложения");
        Scanner scanner = new Scanner(System.in);
        sum = scanner.nextInt();
        setAmount(amount + sum);
    }
    public void withDraw(int sum) throws LimitException {
        System.out.println("Введите сумму снятия");
        Scanner scanner = new Scanner(System.in);
        sum = scanner.nextInt();
        if(sum <= amount)
        setAmount(amount -sum);
        else if (amount == 0) {
            System.out.println("На счете нет средств");
        } else {
            throw new LimitException("У вас недостаточно средств. Будет снят остаток");
        }
    }
}
