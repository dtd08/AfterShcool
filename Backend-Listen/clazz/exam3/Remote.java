package clazz.exam3;

public interface Remote {
    public boolean getIsPairing();      // 페어링 중인지 확인
    public void pairingTV(TV pairTV);          // 페어링 해제
    public void changeChannel(int inputSigna);     // 채널 변경 (is채널업과 협동)
    public void printStreamingFuc(); // 현재 스트리밍 상태 확인
    public void turnOnOffTv();       // TV 전원 조절
}
