package find_primes;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            if(checkPrime(i)) {
                System.out.println("Lazy " + i);
            }
        }
    }

    private boolean checkPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
