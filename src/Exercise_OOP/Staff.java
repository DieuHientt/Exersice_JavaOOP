package Exercise_OOP;

import java.util.ArrayList;
import java.util.List;

public abstract class Staff  implements ListSalary{
    private String id = null;
    private String name = null;
    private   int workingDays = 0;
    private int overtimeDays =0;

    public Staff(){};
    public Staff(String id, String name, int workingDays, int overtimeDays) {
        this.id=id;
        this.name = name;
        this.workingDays = workingDays;
        this.overtimeDays = overtimeDays;

    }
    public abstract double getDailySalary();

    public double calculateSalary() {
        double dailySalary = getDailySalary();
        double totalSalary = dailySalary * workingDays;
        return totalSalary;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getOvertimeDays() {
        return overtimeDays;
    }

    public void setOvertimeDays(int overtimeDays) {
        this.overtimeDays = overtimeDays;
    }

}
