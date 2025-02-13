package assignment3_3.task1;

public class BankAccount {
    static int bankBalance=0;
    static int bankAccountAmount=0;

    int accountBalance;
    int accountNumber;

    public BankAccount(int accountBalance) {
        this.accountBalance = accountBalance;
        bankBalance+=accountBalance;
        bankAccountAmount++;
        this.accountNumber = bankAccountAmount;
    }

    void deposit(int amount) {
        bankBalance+=amount;
    }

    int withdraw(int amount) {
        if(bankBalance-amount>=0) {
            bankBalance-=amount;
            return bankBalance;
        }
        else {
            return 0;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return bankBalance;
    }

    public static int getTotalAccounts(){
        return bankAccountAmount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
