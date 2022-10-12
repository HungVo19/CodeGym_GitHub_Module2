package src.interface_and_abstract_class.assignment.animal_class_and_interface_edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSound());

            if(a instanceof Chicken){
                Edible edibler = (Chicken) a;
                System.out.println(edibler.howtoEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
