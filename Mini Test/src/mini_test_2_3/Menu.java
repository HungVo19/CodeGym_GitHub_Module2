package mini_test_2_3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem managementSystem = new EmployeeManagementSystem();
        do {
            System.out.println("Menu");
            System.out.println("1. Display all employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Remove employee");
            System.out.println("4. Update an employee");
            System.out.println("5. Calculate average salary");
            System.out.println("6. Display below average salary full-time employees");
            System.out.println("7. Calculate total salary of all part-time employees");
            System.out.println("8. Display all full-time employees by ascending net salary");
            System.out.println("0. Exit");
            boolean checkChoiceInput = false;
            int choice = -1;
            do {
                try {
                    System.out.println("Enter your choice:");
                    choice = Integer.parseInt(scanner.nextLine());
                    checkChoiceInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input type. Try again!");
                }
            } while (!checkChoiceInput);
            switch (choice) {
                case 1:
                    managementSystem.display();
                    break;
                case 2:
                    do {
                        int choice1 = -1;
                        boolean checkChoice1Input = false;
                        do {
                            try {
                                System.out.println("1. Full time employee");
                                System.out.println("2. Part time employee");
                                System.out.println("0. Exit");
                                System.out.println("Enter your choice:");
                                choice1 = Integer.parseInt(scanner.nextLine());
                                checkChoice1Input = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Wrong input type. Try again!");
                            }
                        } while (!checkChoice1Input);
                        if (choice1 == 0) {
                            break;
                        }
                        managementSystem.add(choice1, scanner);
                    } while (true);
                    break;
                case 3:
                    if(managementSystem.getEmployees().isEmpty()){
                        System.out.println("The list is EMPTY now. Try to add an employee first!");
                        break;
                    }
                    do {
                        int choice3 = -1;
                        boolean checkChoice3Input = false;
                        do {
                            try {
                                System.out.println("1. Remove all");
                                System.out.println("2. Remove by Id");
                                System.out.println("0. Exit");
                                System.out.println("Enter your choice:");
                                choice3 = Integer.parseInt(scanner.nextLine());
                                checkChoice3Input = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Wrong input type. Try again");
                            }
                        } while (!checkChoice3Input);
                        if (choice3 == 0) {
                            break;
                        }
                        managementSystem.remove(choice3, scanner);
                    } while (true);
                    break;
                case 4:
                    if(managementSystem.getEmployees().isEmpty()){
                        System.out.println("The list is EMPTY now. Try to add an employee first!");
                        break;
                    }
                    managementSystem.update(scanner);
                    break;
                case 5:
                    System.out.println("Average Salary is " + managementSystem.averageSalary());
                    break;
                case 6:
                    managementSystem.findBelowAverageSalaryFullTimeEmployees();
                    break;
                case 7:
                    managementSystem.calculateTotalSalaryOfPartTimeEmployees();
                    break;
                case 8:
                    managementSystem.displayFullTimeEmployeesByAscendingNetSalary();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
