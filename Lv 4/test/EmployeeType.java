package level4.test;

public enum EmployeeType {
    FULL_TIME(1.0, "Full Time"),
    CONTRACT(0.8, "Contract"),
    INTERN(0.5, "Intern");

    private final String type;
    private final double baesu;

    EmployeeType(double baesu, String type) {
        this.baesu = baesu;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double adjustBaseSalary(double baseSalary) {
        return baesu * baseSalary;
    }
}
