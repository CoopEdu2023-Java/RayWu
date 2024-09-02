abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("Deposit");
    }
    @Override
    void withdraw() {
        System.out.println("Withdraw");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("Deposit");
    }
    @Override
    void withdraw() {
        System.out.println("Withdraw");
    }
}