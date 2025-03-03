package e1;

public class SilverBankAccount extends AbstractPolicyBankAccount {

    public SilverBankAccount(BankAccount baseBankAccount) {
        super.baseBankAccount = baseBankAccount;
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        super.baseBankAccount.withdraw(amount + 1);
    }
}
