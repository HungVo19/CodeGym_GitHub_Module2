package run_odd_even_numvers;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        ot.start();
        ot.join();
        et.start();
    }
}
