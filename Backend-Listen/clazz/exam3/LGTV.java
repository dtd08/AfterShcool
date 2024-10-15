package clazz.exam3;

public class LGTV extends TVParents {
    private String name;
    private boolean isPairing;
    private int channel;
    private boolean power;
    private String streamingService;

    public LGTV(String name) {
        super(name, "유튜브");
    }
}
