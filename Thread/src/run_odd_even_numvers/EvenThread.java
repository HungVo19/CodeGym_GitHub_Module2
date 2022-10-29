package run_odd_even_numvers;

public class EvenThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i < 10; i++) {
                if(i%2 == 0) {
                    System.out.println("Printing even number " + i);
                }
            }
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.print("");
        }
    }
}
