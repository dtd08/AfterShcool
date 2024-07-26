package level4.test;

public class FullTimeEmployee implements Employee {

    private double baseSalary;
    private double bonus;
    private final EmployeeType type = EmployeeType.FULL_TIME;

    public FullTimeEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return type.adjustBaseSalary(baseSalary) + bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return type;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{"
                + "baseSalary=" + baseSalary
                + ", bonus=" + bonus
                + ", employeeType=" + type.name() + "}";
    }
}
