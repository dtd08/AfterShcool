package clazz.exam3;

public class TVParents implements TV {
    private String name;
    private boolean isPairing;
    private int channel;
    private boolean power;
    private String streamingService;

    public TVParents(String name) {
        this.name = name;
        this.channel = 1;
        this.power = false;
        this.streamingService = "기본";
    }

    public TVParents(String name, String streamingService) {
        this.name = name;
        this.channel = 1;
        this.power = false;
        this.streamingService = streamingService;
    }

    @Override
    public void turnOnOff() {
        if (!power) {
            System.out.println("TV의 전원이 켜졌습니다.");
            power = true;
        }
        else {
            System.out.println("TV의 전원이 꺼졌습니다.");
            power = false;
        }
    }

    @Override
    public void pairing() {
        if (isPairing) {
            System.out.println(name + "의 연결이 해제됩니다.");
            isPairing = false;
        }
        else {
            System.out.println(name + "의 연결이 시작됩니다.");
            isPairing = true;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getChannel() {  // 채널 확인
        return channel;
    }

    @Override
    public boolean isPower() {
        return power;
    }

    public String getStreamingService() {
        return streamingService;
    }

    @Override
    public void setChannel(int channel) {  // 채널 변경
        this.channel = channel;
    }
}
