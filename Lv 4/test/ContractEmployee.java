package level4.test;

public class ContractEmployee implements Employee {

    private double baseSalary;
    private final EmployeeType type = EmployeeType.CONTRACT;

    public ContractEmployee(double baseSalary) {
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
        return "ContractEmployee{"
                + "baseSalary=" + baseSalary
                + ", employeeType=" + type.name() + "}";
    }
}
