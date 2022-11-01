package mini_test_2_3;

import java.io.*;
import java.util.*;

import com.bethecoder.ascii_table.impl.CollectionASCIITableAware;
import com.bethecoder.ascii_table.impl.JDBCASCIITableAware;
import com.bethecoder.ascii_table.spec.IASCIITableAware;
import com.bethecoder.ascii_table.ASCIITable;
import com.bethecoder.ascii_table.ASCIITableHeader;
import com.jakewharton.fliptables.FlipTableConverters;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = readFromFile();
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
            System.out.println("Invalid choice. Try again!");
        } else {
            String id = "";
            do {
                System.out.println("Enter id: ");
                id = scanner.nextLine();
                if (checkIdExist(id)) {
                    System.out.println("Id " + id + " is already existed. Please Input new Id!");
                }
                if (id.isEmpty() || id.contains(" ")) {
                    System.out.println("Please enter valid Id");
                }
            } while (checkIdExist(id) || id.isEmpty() || id.contains(" "));

            String name;
            do {
                System.out.println("Enter name: ");
                name = scanner.nextLine();
                if (name.isEmpty()){
                    System.out.println("Name cannot be empty!");
                }
            }
            while (name.isEmpty());

            boolean checkAgeInput = false;
            int age = -1;
            do {
                try {
                    System.out.println("Enter age: ");
                    age = Integer.parseInt(scanner.nextLine());
                    checkAgeInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input type. Try again!");
                }
            } while (!checkAgeInput);

            System.out.println("Enter tel: ");
            String tel = scanner.nextLine();

            System.out.println("Enter email: ");
            String email = scanner.nextLine();
            if (choice == 1) {

                boolean checkBonusInput = false;
                double bonus = 0;
                do {
                    try {
                        System.out.println("Enter bonus: ");
                        bonus = Integer.parseInt(scanner.nextLine());
                        checkBonusInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input type. Try again!");
                    }
                } while (!checkBonusInput);

                boolean checkFineInput = false;
                double fine = 0;
                do {
                    try {
                        System.out.println("Enter fine: ");
                        fine = Integer.parseInt(scanner.nextLine());
                        checkFineInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input type. Try again!");
                    }
                } while (!checkFineInput);

                boolean checkHardSalaryInput = false;
                int hardSalary = 0;
                do {
                    try {
                        System.out.println("Enter hard salary: ");
                        hardSalary = Integer.parseInt(scanner.nextLine());
                        checkHardSalaryInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input type. Try again!");
                    }
                } while (!checkHardSalaryInput);

                employees.add(new FullTimeEmployee(id, name, age, tel, email, bonus, fine, hardSalary));
            } else {

                boolean checkWorkHoursInput = false;
                double workHours = 0;
                do {
                    try {
                        System.out.println("Enter work hours: ");
                        workHours = Integer.parseInt(scanner.nextLine());
                        checkWorkHoursInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input type. Try again!");
                    }
                } while (!checkWorkHoursInput);

                employees.add(new PartTimeEmployee(id, name, age, tel, email, workHours));
            }
            System.out.println("New employee data added successfully!");
            writeToFile();
        }
    }

    public void remove(int choice, Scanner scanner) {
        if (choice < 0 || choice > 2) {
            System.out.println("Invalid choice. Try again!");
        } else {
            if (choice == 1) {
                removeAll();
                System.out.println("Remove all employees successfully!");
            } else {
                removeByID(scanner);
            }
            writeToFile();
        }
    }


    private void removeAll() {
        employees.clear();
    }

    private void removeByID(Scanner scanner) {
        System.out.println("Enter id of employee to remove:");
        String id = scanner.nextLine();
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println(id + " Id is not found!");
        } else {
            System.out.println(employees.get(index));
            System.out.println(" is removed successfully!");
            employees.remove(index);
        }
    }

    public void update(Scanner scanner) {
        System.out.println("Enter Id:");
        String id = scanner.nextLine();
        if (!checkIdExist(id)) {
            System.out.println("Id " + id + " is not existed!");
        } else {
            String newId;
            do {
                System.out.println("Update Id:");
                newId = scanner.nextLine();
                if (checkIdExist(newId)) {
                    System.out.println("Id is already existed!");
                } else if (newId.contains(" ")) {
                    System.out.println("Try input a valid Id!");
                } else if (!newId.equals("")) {
                    employees.get(findIndexById(id)).setId(newId);
                }
            } while (checkIdExist(newId) || newId.contains(" "));
            System.out.println("Update name:");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                employees.get(findIndexById(id)).setName(name);
            }
            System.out.println("Update age:");
            String age = scanner.nextLine();
            if (!age.equals("")) {
                employees.get(findIndexById(id)).setAge(Integer.parseInt(age));
            }
            System.out.println("Update tel:");
            String tel = scanner.nextLine();
            if (!tel.equals("")) {
                employees.get(findIndexById(id)).setTel(tel);
            }
            System.out.println("Update email:");
            String email = scanner.nextLine();
            if (!email.equals("")) {
                employees.get(findIndexById(id)).setEmail(email);
            }
            if (employees.get(findIndexById(id)) instanceof FullTimeEmployee) {
                System.out.println("Update bonus:");
                String bonus = scanner.nextLine();
                if (!bonus.equals("")) {
                    ((FullTimeEmployee) employees.get(findIndexById(id))).setBonus(Double.parseDouble(bonus));
                }
                System.out.println("Update fine:");
                String fine = scanner.nextLine();
                if (!fine.equals("")) {
                    ((FullTimeEmployee) employees.get(findIndexById(id))).setFine(Double.parseDouble(fine));
                }
                System.out.println("Update hard salary:");
                String hardSalary = scanner.nextLine();
                if (!hardSalary.equals("")) {
                    ((FullTimeEmployee) employees.get(findIndexById(id))).setHardSalary(Double.parseDouble(hardSalary));
                }
            } else if (employees.get(findIndexById(id)) instanceof PartTimeEmployee) {
                System.out.println("Update work hours:");
                String workHours = scanner.nextLine();
                if (!workHours.equals("")) {
                    ((PartTimeEmployee) employees.get(findIndexById(id))).setWorkHours(Double.parseDouble(workHours));
                }
            }
        }
        System.out.println("Updated successfully!");
        writeToFile();
    }

    public int averageSalary() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now. Try to add an employee first!");
            return 0;
        } else {
            int total = 0;
            for (Employee e : employees) {
                total += e.getNetSalary();
            }
            return total / employees.size();
        }
    }

    public void findBelowAverageSalaryFullTimeEmployees() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now. Try to add an employee first!");
        } else {
            System.out.println("Average Salary is " + averageSalary());
            System.out.printf("%-5s%-15s%-10s%-10s%-35s%-15s%-15s%-15s%-15s%s",
                    "ID", "Type", "Name", "Age", "Tel", "Email", "Bonus", "Fine", "Hard Salary", "Net Salary\n");
            for (Employee e : employees) {
                if (e instanceof FullTimeEmployee && e.getNetSalary() < averageSalary()) {
                    System.out.printf("%-5s%-15s%-10s%-10s%-15s%-35s%-15s%-15s%-15s%s",
                            e.getId(), "Full-time", e.getName(), e.getAge(), e.getTel(), e.getEmail(),
                            ((FullTimeEmployee) e).getBonus(), ((FullTimeEmployee) e).getFine(),
                            ((FullTimeEmployee) e).getHardSalary(),
                            e.getNetSalary() + "\n");
                }
            }
        }
    }

    public void calculateTotalSalaryOfPartTimeEmployees() {
        ArrayList<PartTimeEmployee> partTimeEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e instanceof PartTimeEmployee) {
                partTimeEmployees.add((PartTimeEmployee) e);
            }
        }
        if (partTimeEmployees.isEmpty()) {
            System.out.println("There are not any part-time employees. Try to add an employee first!");
        } else {
            int total = 0;
            for (PartTimeEmployee e : partTimeEmployees) {
                total += e.getNetSalary();
            }
            System.out.println("Total Salary paid to Part-time employees is " + total);
        }
    }

    public void displayFullTimeEmployeesByAscendingNetSalary() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now. Try to add an employee first!");
        } else {

            ArrayList<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
            for (Employee e : employees) {
                if (e instanceof FullTimeEmployee) {
                    fullTimeEmployees.add((FullTimeEmployee) e);
                }
            }

            if (fullTimeEmployees.isEmpty()) {
                System.out.println("There are not any full-time employees. Try to add an employee first!");
            } else {
                fullTimeEmployees.sort(FullTimeEmployee::compareTo);
//                System.out.println(FlipTableConverters.fromIterable(fullTimeEmployees,));
                }
            }
        }


    private void writeToFile() {
        File file = new File("Mini Test/src/mini_test_2_3/EmployeesList.txt");
        try {
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
            FileInputStream inputFile = new FileInputStream("Mini OutputTableTest/src/mini_test_2_3/EmployeesList.txt");
            if (inputFile.available() > 0) {
                ObjectInputStream ois = new ObjectInputStream(inputFile);
                employeesList = (ArrayList<Employee>) ois.readObject();
                ois.close();
                inputFile.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.print("");
        }
        return employeesList;
    }


    public void display() {
        if (employees.isEmpty()) {
            System.out.println("The list is EMPTY now. Try add first!");
        } else {
            System.out.printf("%-5s%-15s%-10s%-10s%-15s%-35s%-15s%-15s%-15s%-15s%s",
                    "ID", "Type", "Name", "Age", "Tel", "Email", "Bonus", "Fine", "Hard Salary", "Work Hours", "Net Salary\n");
            for (Employee e : employees) {
                if (e instanceof FullTimeEmployee) {
                    System.out.printf("%-5s%-15s%-10s%-10s%-15s%-35s%-15s%-15s%-15s%-15s%s",
                            e.getId(), "Full-time", e.getName(), e.getAge(), e.getTel(), e.getEmail(),
                            ((FullTimeEmployee) e).getBonus(), ((FullTimeEmployee) e).getFine(),
                            ((FullTimeEmployee) e).getHardSalary(), "na",
                            e.getNetSalary() + "\n");
                } else if (e instanceof PartTimeEmployee) {
                    System.out.printf("%-5s%-15s%-10s%-10s%-15s%-35s%-15s%-15s%-15s%-15s%s",
                            e.getId(), "Part-time", e.getName(), e.getAge(), e.getTel(), e.getEmail(),
                            "na", "na","na", ((PartTimeEmployee) e).getWorkHours(),
                            e.getNetSalary() + "\n");
                }
            }
        }
    }

    private int findIndexById(String id) {
        int index = -1;
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                index = employees.indexOf(e);
            }
        }
        return index;
    }

    private boolean checkIdExist(String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
