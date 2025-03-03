package e1;

public class BronzeBankAccount implements BankAccount {
    private final BankAccount baseBankAccount;

    public BronzeBankAccount(BankAccount baseBankAccount) {
        this.baseBankAccount = baseBankAccount;
    }

    @Override
    public int getBalance() {
        return this.baseBankAccount.getBalance();
    }

    @Override
    public void deposit(int amount) {
        this.baseBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        final int optionalFee = amount < 100 ? 0 : 1;
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        this.baseBankAccount.withdraw(amount + optionalFee);
    }
}
