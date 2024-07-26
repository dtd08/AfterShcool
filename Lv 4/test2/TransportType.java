package test2;

public enum TransportType {
    CAR(150, "자동차"),
    BICYCLE(20, "자전거"),
    TRAIN(300, "기차"),
    MOTORCYCLE(100, "오토바이");

    private final Integer speed;
    private final String description;

    TransportType(Integer speed, String description) {
        this.speed = speed;
        this.description = description;
    }

    public Integer getSpeed() {
        return speed;
    }

    public String getDescription() {
        return description;
    }
}
