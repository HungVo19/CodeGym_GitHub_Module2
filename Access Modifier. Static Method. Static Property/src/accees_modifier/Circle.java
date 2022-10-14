package accees_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double r){
        this.radius = r;
    }

    public double getRadiusPublic() {
        System.out.println("This is public method");
        return radius;
    }

    private double getRadiusPrivate(double r){
        System.out.println("This is private method");
        return radius;
    }

    protected double getRadiusProtected(float r){
        System.out.println("This is protected method");
        return radius;
    }

    double getRadiusDefault(double i, float j){
        System.out.println("This is default method");
        return radius;
    }


   public double getArea(){
        return (radius * radius * Math.PI);
   }

   public double getAreaPublicStaic(){
       System.out.println("This is public and static");
        return (radius * radius * Math.PI);
   }


}
