public class BankAccount {

    private double balance;


    public BankAccount(double balance) {

        this.balance = balance;
    }


    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }


    synchronized public void withdraw(double amount) {

        System.out.println("Withdraw amount of " + amount + " is initiated.");

        if (balance < amount) {

            try {

                wait();

            } catch (Exception e) {

                System.out.println(e);
            }
        }

        balance -= amount;
        System.out.println("Amount of " + amount + " has been withdrawn from bank account");
    }



    synchronized public void deposit(double amount) {

        System.out.println("Deposit of " +amount + " is initiated.");
        balance += amount;
        System.out.println("Deposit of " +amount + " is completed.");
        notify();
    }
}
