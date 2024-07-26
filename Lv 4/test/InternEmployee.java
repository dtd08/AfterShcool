package level4.test;

public class InternEmployee implements Employee {

    private double baseSalary;
    private final EmployeeType type = EmployeeType.INTERN;

    public InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return type.adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return type;
    }

    @Override
    public String toString() {
        return "InternEmployee{"
                + "baseSalary=" + baseSalary
                + ", employeeType=" + type.name() + "}";
    }
}
