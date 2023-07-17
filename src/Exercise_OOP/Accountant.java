package Exercise_OOP;

import java.util.List;

public class Accountant extends Staff  {
    public Accountant(String id, String name, int workingDays, int overtimeDays) {
        super(id, name, workingDays, overtimeDays);
    }

    @Override
    public double getDailySalary() {
        return value;
    }


    static Salary mySlary =Salary.salary5;
    static double value =  mySlary.getsalary();


    public void printSalaryList(List<Staff> staffList) {
        System.out.println("Salary List:");
        for (Staff index : staffList) {
            System.out.println("Id: "+ index.getId()+" ,Name: " +index.getName() + " ,Salary: " +index.calculateSalary());
        }
    }
}
