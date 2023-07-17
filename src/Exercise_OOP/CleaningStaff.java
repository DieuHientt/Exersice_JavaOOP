package Exercise_OOP;

public class CleaningStaff extends Staff {
    public CleaningStaff(String id, String name, int workingDays, int overtimeDays) {
        super(id, name, workingDays, overtimeDays);
    }

    static Salary mySlary =Salary.salary1;
    static double value =  mySlary.getsalary();
    @Override
    public double getDailySalary() {
        return value;
    }

}
