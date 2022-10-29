package run_odd_even_numvers;

public class OddThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i < 10; i++) {
                if(i%2 != 0) {
                    System.out.println("Printing odd number " + i);
                }
            }
            Thread.sleep(15);
        } catch (Exception e) {
            System.out.print("");
        }
    }
}
