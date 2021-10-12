package lesson4;

import java.util.ArrayList;
import java.util.List;


public class SalaryCalculator {
    public static void main(String[] args) {
        CEO ceo = new CEO(30000);
        Manager manager = new Manager();
        manager.setSalary(20000);
        NormalEmployee employee1 = new NormalEmployee();
        employee1.setSalary(15000);
        NormalEmployee employee2 = new NormalEmployee();
        employee2.setSalary(10000);
        List<NormalEmployee> normalEmployeeList = new ArrayList<>();
        normalEmployeeList.add(employee1);
        normalEmployeeList.add(employee2);
        double totalSalaries = ceo.getSalary() + manager.getSalary();
        for (NormalEmployee normalEmployee : normalEmployeeList) {
            totalSalaries += normalEmployee.getSalary();
        }
        System.out.printf("Total Salaries : %f", totalSalaries);
    }

}
