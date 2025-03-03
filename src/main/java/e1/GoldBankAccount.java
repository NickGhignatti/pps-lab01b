package e1;

public class GoldBankAccount extends AbstractPolicyBankAccount {

    public GoldBankAccount(BankAccount baseBankAccount) {
        super.baseBankAccount = baseBankAccount;
    }

    @Override
    public void withdraw(int amount) {
        if (super.baseBankAccount.getBalance() + 500 < amount) {
            throw new IllegalStateException("Withdraw the following amount is not possible due to insufficient balance");
        }
        super.baseBankAccount.withdraw(amount);
    }
}
