package create_simple_thread;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing " +i);
//                System.out.println(hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
    }
}
