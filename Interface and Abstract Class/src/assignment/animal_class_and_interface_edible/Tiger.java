package assignment.animal_class_and_interface_edible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger make sound";
    }

    @Override
    public String howtoEat() {
        return "Tiger is eatable";
    }
}
