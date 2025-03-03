package e1;

public abstract class AbstractPolicyBankAccount implements BankAccount{
    protected BankAccount baseBankAccount;

    @Override
    public int getBalance() {
        return this.baseBankAccount.getBalance();
    }

    @Override
    public void deposit(int amount) {
        this.baseBankAccount.deposit(amount);
    }

    @Override
    public abstract void withdraw(int amount);
}
