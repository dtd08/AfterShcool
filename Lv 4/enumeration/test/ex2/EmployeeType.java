package enumeration.test.ex2;

public enum EmployeeType {
    FULL_TIME(1.0),
    CONTRACT(0.8),
    INTERN(0.5);

    private final double salaryMultiplier; // setter가 없어서 어차피 final과 같은 역할이 됨 (기능상 다른점은 크게 없는데, final을 붙이면 좀 더 명확한 코드가 됨)

    EmployeeType(double salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }

    public double adjustBaseSalary(double baseSalary) {
        return baseSalary * salaryMultiplier;
    }
}