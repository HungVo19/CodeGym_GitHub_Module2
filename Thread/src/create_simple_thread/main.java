package create_simple_thread;

public class main {
    public static void main(String[] args) {
        NumberGenerator ng1 = new NumberGenerator();
        NumberGenerator ng2 = new NumberGenerator();
        NumberGenerator ng3 = new NumberGenerator();

        Thread threadOfNG1 = new Thread(ng1);
        Thread threadOfNG2 = new Thread(ng2);
        Thread threadOfNG3 = new Thread(ng3);

        threadOfNG1.setPriority(10);
        threadOfNG2.setPriority(1);
        threadOfNG1.start();
        threadOfNG2.start();
        threadOfNG3.start();
    }
}
