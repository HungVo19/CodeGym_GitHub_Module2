package src.access_modifier_static_method_static_property.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "skyactive 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 5", "skyactive 5");
        Car car3 = new Car("Mazda 6", "skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
