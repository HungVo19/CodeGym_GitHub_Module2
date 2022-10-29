package mini_test_2_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = readFromFile();
    }

    public EmployeeManagementSystem(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void add(int choice, Scanner scanner) {
        if (choice < 0 || choice > 2) {
            System.out.println("Invalid choice");
        } else {
            System.out.print("Enter id:");
            String id = scanner.nextLine();
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            System.out.print("Enter age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter tel:");
            int tel = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter email:");
            String email = scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter bonus");
                int bonus = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter fine");
                int fine = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter hard salary");
                int hardSalary = Integer.parseInt(scanner.nextLine());
                employees.add(new FullTimeEmployee(id, name, age, tel, email, bonus, fine, hardSalary));
            } else {
                System.out.print("Enter work hours");
                int workHours = Integer.parseInt(scanner.nextLine());
                employees.add(new PartTimeEmployee(id, name, age, tel, email, workHours));
            }
            System.out.println("New employee data added successfully!");
            writeToFile();
        }
    }

    public int averageSalary() {
        if (employees.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (Employee e : employees) {
            if (e instanceof FullTimeEmployee) {
                total += ((FullTimeEmployee) e).netSalary();
            } else if (e instanceof PartTimeEmployee) {
                total += ((PartTimeEmployee) e).netWage();
            }
        }
        int averageSalary = total / employees.size();
        return averageSalary;
    }

    public void findBelowAverageSalary() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now!");
        } else {
            for (Employee e : employees) {
                if (e instanceof FullTimeEmployee && ((FullTimeEmployee) e).getHardSalary() < averageSalary()) {
                    System.out.println(e);
                }
            }
        }
    }

    public int sumSalaryOfPartTimeEmployees() {
        int total = 0;
        for (Employee e : employees) {
            if (e instanceof PartTimeEmployee) {
                total += ((PartTimeEmployee) e).netWage();
            }
        }
        return total;
    }

    public void displayFullTimeEmployeesByAscendingNetSalary() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now!");
        } else {
            NetSalaryComparator ascending = new NetSalaryComparator();

            ArrayList<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
            for (Employee e : employees) {
                if (e instanceof FullTimeEmployee) {
                    fullTimeEmployees.add((FullTimeEmployee) e);
                }
            }

            if (fullTimeEmployees.isEmpty()) {
                System.out.println("There are not any full-time employees");
            } else {
                fullTimeEmployees.sort(ascending);
                for (FullTimeEmployee e : fullTimeEmployees) {
                    System.out.println(e);
                }
            }
        }
    }

    private void writeToFile() {
        File file = new File("D:\\Code Gym\\CodeGym_GitHub_Module2\\Mini Test\\src\\mini_test_2_3\\EmployeesList.txt");
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            FileOutputStream outputFile = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(outputFile);
            oos.writeObject(employees);
            oos.close();
            outputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Employee> readFromFile() {
        ArrayList<Employee> employeesList = new ArrayList<>();
        try {
            FileInputStream inputFile = new FileInputStream("D:\\Code Gym\\CodeGym_GitHub_Module2\\Mini Test\\src\\mini_test_2_3\\EmployeesList.txt");
            ObjectInputStream ois = new ObjectInputStream(inputFile);
            employeesList = (ArrayList<Employee>) ois.readObject();
            ois.close();
            inputFile.close();
        } catch (Exception e) {
            System.out.print("");
        }
        return employeesList;
    }


    public void display() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now!");
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
