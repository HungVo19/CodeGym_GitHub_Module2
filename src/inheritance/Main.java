package src.inheritance;

class Sub {
    static {
        int a = 1;
        double b = 2.0d;
        String c = "abc";
    }

    static public void method(){
        System.out.println("hihi");
    }

}
public class Main{
    public static void main(String[] args) {
    Sub.method();
}
    static {
        System.out.println("Menu from static block");
    }

}