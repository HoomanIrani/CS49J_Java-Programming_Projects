public class Main {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1000);
        System.out.println("Initial bank account balance is: " +b1.getBalance());

        Thread t1 = new Thread(){
            public void run() {
                b1.withdraw(1500);
            }
        };


        Thread t2 = new Thread() {
            public void run() {

                b1.deposit(2000);
            }
        };

        t1.start();
        t2.start();

        try{

            t1.join();
            t2.join();
        }catch (Exception e) {

            System.out.println(e);
        }

        System.out.println("Final bank account balance is: " +b1.getBalance());

    }
}
