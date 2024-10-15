package clazz.exam3_solution;

public class SamsungTV implements TV {
    private int currentChannel = 1;
    private boolean powerOn = false;
    private boolean paired = false;

    @Override
    public void setPower(boolean power) {
        // 리모컨과 페어링된 경우에만 전원 조작 가능
        if (paired) {
            powerOn = power;
            if (power) {
                System.out.println("Samsung TV is now on.");
            } else {
                System.out.println("Samsung TV is now off.");
            }
        } else {
            System.out.println("Samsung TV is not paired.");
        }
    }

    @Override
    public void changeChannerl(int channel) {
        // 리모컨과 페어링 되고, 전원이 켜져있는 경우에서만 조작 가능
        if (paired && powerOn){
            this.currentChannel = channel;
            System.out.println("Samsung TV : Change to channel"+channel);
        } else if (!paired) System.out.println("Samsung TV is not paired");
        else System.out.println("Samsung TV is OFF. Cannot change channel");
    }

    @Override
    public int getCurrentChannerl() {
        return currentChannel;
    }

    @Override
    public boolean isPowerOn() {
        return powerOn;
    }

    @Override
    public boolean isPaired() {
        return paired;
    }

    @Override
    public void setPair(boolean pair) {
        paired = pair;
        if (pair) {
            System.out.println("Samsung TV paired with remote.");
        } else System.out.println("Samsung TV unpaired from remote.");
    }

    @Override
    public String getTVName() {
        return "Samsung TV";
    }

    // 고유 기능: 넷플릭스 스트리밍 가능
    public void watchNetflix() {
        // TV의 전원이 켜져 있을 때만 시청 가능
        if (powerOn) {
            System.out.println("Samsung TV: Now Netflix");
        } else {
            System.out.println("Samsung TV is OFF. Cannot stream Netflix");
        }
    }
}