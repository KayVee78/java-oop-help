public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount("Kithmi", 20000);

        myBankAccount.withdraw(10000);
        myBankAccount.deposit(30000);
        System.out.println("Account owner: " + myBankAccount.getOwner());
        System.out.println("Account balance: " + myBankAccount.getBalance());

    }
}