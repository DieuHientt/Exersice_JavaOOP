package Exercise_OOP;

public class Receptionist extends Staff {
    public Receptionist(String id, String name, int workingDays, int overtimeDays) {
        super(id, name, workingDays, overtimeDays);
    }

    static Salary mySlary =Salary.salary2;
    static double value =  mySlary.getsalary();
    @Override
    public double getDailySalary() {
        return value;
    }
}
