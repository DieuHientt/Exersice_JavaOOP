package Exercise_OOP;

public enum Salary {
    salary1(300),
    salary2(350),
    salary3(1500),
    salary4(800),
    salary5(500);

    private double salary;

    private Salary(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }
}
