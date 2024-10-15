package clazz.exam3_solution;

public class UniversalRemoteControl implements RemoteControl {
    private TV pairedTV;

    // TV와 리모컨을 페어링하는 메서드
    public void pairWith(TV tv) {
        // 이미 다른 TV와 페어링 되어 있을 경우
        if (pairedTV != null && pairedTV != tv) {
            System.out.println(pairedTV.getTVName() + "'s pairing has been disconnected.");
            pairedTV.setPair(false);
        }
        pairedTV = tv;
        tv.setPair(true);
    }

    @Override
    public void setPower(boolean power) {
        // TV가 있고, 페어링 된 경우
        if (pairedTV != null && pairedTV.isPaired()) {
            pairedTV.setPower(power);
        } else {
            System.out.println("No TV paired.");
        }
    }

    @Override
    public void setChannel(int channel) {
        // 페어링된 TV가 있고, TV의 전원이 켜져 있을 때만 이용 가능
        if (pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            pairedTV.changeChannerl(channel);
        } else if (pairedTV == null || !pairedTV.isPaired()) {
            System.out.println("No TV is paired.");
        } else {
            System.out.println("The TV is OFF. Cannot change channel");
        }
    }

    @Override
    public void nextChannel() {

    }

    @Override
    public void previousChannel() {

    }
}
