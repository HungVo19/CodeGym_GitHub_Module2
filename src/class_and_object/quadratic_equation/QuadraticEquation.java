package src.class_and_object.quadratic_equation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }


    public double getRoot1(){
        double r1 = 0;
        if (getDiscriminant() >= 0){
            r1 = (Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5) - this.b)/(2 * this.a);
        }
        return r1;
    }

    public double getRoot2(){
        double r2 = 0;
        if (getDiscriminant() >= 0){
            r2 = (- this.b - Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5))/(2 * this.a);
        }
        return r2;
    }

}
