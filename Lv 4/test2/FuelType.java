package test2;

public enum FuelType {
    GASOLINE(0.8),
    DIESEL(0.9),
    ELECTRIC(0.95);

    private final Double efficiency;

    FuelType(Double efficiency) {
        this.efficiency = efficiency;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public Double calculateRequiredFuel(Double distance) {
        return distance + (distance * (1.0 - efficiency));
    }
}
