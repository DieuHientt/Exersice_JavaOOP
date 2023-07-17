package Exercise_OOP;

public class Engineer extends Staff  {
    public enum EngineerType {
        SOFTWARE,
        NETWORK
    }

    private EngineerType type;

    public Engineer(String id, String name, int workingDays, int overtimeDays, EngineerType type) {
        super(id, name, workingDays, overtimeDays);
        this.type= type;
    }
    static Salary mySlary =Salary.salary4;
    static double value =  mySlary.getsalary();
    @Override
    public double getDailySalary() {
        return value;
    }

}

