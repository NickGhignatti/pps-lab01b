package e1;

public class SilverBankAccount implements BankAccount{
    private final int FEE = 1;
    private final BankAccount base;

    public SilverBankAccount(BankAccount baseBankAccount) {
        this.base = baseBankAccount;
    }

    public int getBalance() {
        return base.getBalance();
    }

    public void deposit(int amount) {
        base.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + this.FEE);
    }
}
