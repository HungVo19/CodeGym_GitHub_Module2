package find_primes;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyF = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedF = new OptimizedPrimeFactorization();

        Thread threadOfLazyF = new Thread(lazyF);
        Thread threadOfOptimizedF = new Thread(optimizedF);
        threadOfOptimizedF.start();
        threadOfLazyF.start();
    }
}
