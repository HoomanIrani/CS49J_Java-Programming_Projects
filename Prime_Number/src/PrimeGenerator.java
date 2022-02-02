public class PrimeGenerator {

    private int number;

    public PrimeGenerator(int num) {

        number = num;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {

            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }


    public void nextPrime(int n) {

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {

                System.out.println(i);
            }
        }
    }


}

