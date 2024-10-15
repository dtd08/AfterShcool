package clazz.exam3;

public class UniversalRemote implements Remote{

    private boolean isPairing;
    private TV pairTV;

    public UniversalRemote() {
        this.isPairing = false;
        this.pairTV = null;
    }

    @Override
    public boolean getIsPairing() {
        return isPairing;
    }

    @Override
    public void pairingTV(TV pairTV) {
        if (isPairing) this.pairTV.pairing();
        this.pairTV = pairTV;
        pairTV.pairing();
    }

    @Override
    public void changeChannel(int inputSignal) {
        if (pairTV.isPower()) {
            if (inputSignal == -1 || inputSignal == 1) pairTV.setChannel(pairTV.getChannel() + inputSignal);
            else pairTV.setChannel(inputSignal);
        }
    }

    @Override
    public void turnOnOffTv() {
        pairTV.turnOnOff();
    }

    @Override
    public void printStreamingFuc() {
        System.out.println("현재 서비스 중인 스트리밍 기능: " + pairTV.getStreamingService());
    }

    public void showCurrentTV() {
        System.out.println("현재 연결된 TV : " + pairTV.getName());
    }
}
