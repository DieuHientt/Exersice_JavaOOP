package Exercise_OOP;

import java.util.List;

public class Manager extends Staff {
    public Manager(String id, String name, int workingDays, int overtimeDays) {
        super(id, name, workingDays, overtimeDays);
    }

    static Salary mySlary =Salary.salary3;
    static double value =  mySlary.getsalary();
    @Override
    public double getDailySalary() {
        return value;
    }

    public void printAllSalaries(List<Staff> staffList) {
        for (Staff index : staffList) {
            System.out.println("Id: "+ index.getId()+" ,Name: " +index.getName() + " ,Salary: " +index.calculateSalary());
        }
    }

    public Staff findHighestPaidStaff(List<Staff> staffList) {
        Staff highestPaidStaff = null;
        double highestSalary = 0;
        for (Staff index : staffList) {
            if (!(index instanceof Manager) && index.calculateSalary() > highestSalary) {
                highestSalary = index.calculateSalary();
                highestPaidStaff = index;
            }
        }
        return highestPaidStaff;
    }

    public void printHighestPaidStaff(List<Staff> staffList) {
        Staff highestPaidStaff = findHighestPaidStaff( staffList);
        if (highestPaidStaff!= null) {
            System.out.println("The highest paid employee is " + highestPaidStaff.getName() +
                    " with a salary of " + highestPaidStaff.calculateSalary());
        } else {
            System.out.println("There are no employees to show.");
        }
    }

}

