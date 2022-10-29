package demo;

public class Test {
    static int number = 10;

     public Test () {
        this.number = number;
    }

    @Override
    public String toString() {
        return Test.number + "demo";
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
    }
}
