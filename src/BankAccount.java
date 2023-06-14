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
        if (sum > 0){
            setAmount(amount + sum);
        }
        else {
            throw new SumException("Вводимое значение не может быть равно 0 или меньше");
        }

    }
    public void withDraw(int sum) throws LimitException {
        System.out.println("Введите сумму снятия");
        Scanner scanner = new Scanner(System.in);
        sum = scanner.nextInt();
        if(sum > amount && amount>0)
        throw new LimitException("У вас недостаточно средств. Будет снят остаток");
        else if (sum <= 0){
            throw new SumException("Вводимое значение не может быть меньше нуля");
        }
        else if (amount == 0) {
            System.out.println("На счете нет средств");
        }
        else {
            setAmount(amount - sum);
        }
    }
}
