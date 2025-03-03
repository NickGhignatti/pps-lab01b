package e1;

public class BronzeBankAccount extends AbstractPolicyBankAccount {
    public BronzeBankAccount(BankAccount baseBankAccount) {
        super.baseBankAccount = baseBankAccount;
    }

    @Override
    public void withdraw(int amount) {
        final int optionalFee = amount < 100 ? 0 : 1;
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        super.baseBankAccount.withdraw(amount + optionalFee);
    }
}
