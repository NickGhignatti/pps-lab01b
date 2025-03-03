package e1;

public class GoldBankAccount implements BankAccount{
    private final BankAccount baseBankAccount;

    public GoldBankAccount(BankAccount baseBankAccount) {
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
        if (this.baseBankAccount.getBalance() + 500 < amount) {
            throw new IllegalStateException("Withdraw the following amount is not possible due to insufficient balance");
        }
        this.baseBankAccount.withdraw(amount);
    }
}
