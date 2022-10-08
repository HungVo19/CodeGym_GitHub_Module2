package src.arrays_and_method;

import java.util.Scanner;

public class find_element_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"Name A", "Name B", "Name C", "Name D", "Name E",
                            "Name F", "Name G", "Name H", "Name I", "Name J",};

        System.out.println("Enter a name: ");
        String inputName = input.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (inputName.equals(students[i])){
                System.out.println("Position of the student in the list " + inputName + " is: " + i );
                isExist = true;
                break;
            }
        }

        if(!isExist){
            System.out.println("Not found" + inputName + " in the list");
        }
    }
}
