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
            System.out.println("3. Calculate average salary");
            System.out.println("4. Display below average salary employees");
            System.out.println("5. Calculate total salary of all part-time employees");
            System.out.println("6. Display all full-time employees by ascending net salary");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managementSystem.display();
                    break;
                case 2:
                    do {
                        System.out.println("1 Full time employee");
                        System.out.println("2 Part time employee");
                        System.out.println("0. Exit");
                        System.out.println("Enter your choice");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        if (choice1 == 0) {
                            break;
                        }
                        managementSystem.add(choice1, scanner);
                    } while (true);
                    break;
                case 3:
                    System.out.println("Average Salary is " + managementSystem.averageSalary());
                    break;
                case 4:
                    managementSystem.findBelowAverageSalary();
                    break;
                case 5:
                    System.out.println("Total Salary paid to Part-time employees is " + managementSystem.sumSalaryOfPartTimeEmployees());
                    break;
                case 6:
                    managementSystem.displayFullTimeEmployeesByAscendingNetSalary();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
