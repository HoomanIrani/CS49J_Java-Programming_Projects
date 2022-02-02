//////////////////////
// Houman Irani
// CS49J
// 09/30/2020
// This application tries to open a combo lock with 3 entry.
/////////////////////


public class P8_1 {

    public static void main(String[] args) {

        ComboLock locker = new ComboLock(10, 20, 30);

        locker.turnRight(30);
        locker.turnLeft(10);
        locker.turnRight(30);

        System.out.println("Secret numbers are 10, 20, 30");
        System.out.println("Attempting numbers, 30, 10, 30");
        System.out.println("Lock is open: " + locker.open());




        ComboLock lock = new ComboLock(12, 12, 12);

        lock.turnRight(28);
        lock.turnLeft(40);
        lock.turnRight(40);

        System.out.println("\nSecret numbers are 12, 12, 12");
        System.out.println("Attempting numbers, 28, 40, 40");
        System.out.println("Lock is open: " + lock.open());




        ComboLock cl = new ComboLock(11,30,14);

        cl.turnRight(12);
        cl.turnLeft(10);
        cl.turnRight(20);

        System.out.println("\nSecret numbers are 11, 30, 14");
        System.out.println("Attempting numbers, 12, 10, 20");
        System.out.println("Lock is open: " + cl.open());


    }
}




