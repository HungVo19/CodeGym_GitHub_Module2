package assignment.animal_class_and_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken make sound";
    }

    @Override
    public String howtoEat() {
        return "Chicken is eating";
    }
}
