package src.class_and_object;

class A {
     void msg() {
        System.out.println("Hello java");
    }
}

class Simple extends A {
      private void msg() {
        System.out.println("Hello java");
    }
    /*Compile Time Error*/

    public static void main(String args[]) {
        Simple obj = new Simple();
        obj.msg();
    }
}