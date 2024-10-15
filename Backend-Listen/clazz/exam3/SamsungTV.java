package clazz.exam3;

public class SamsungTV extends TVParents {
    private String name;
    private boolean isPairing;
    private int channel;
    private boolean power;
    private String streamingService;

    public SamsungTV(String name) {
        super(name, "넷플릭스");
    }
}
