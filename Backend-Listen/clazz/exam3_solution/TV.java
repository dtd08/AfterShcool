package clazz.exam3_solution;

public interface TV {
    void setPower(boolean power);  // power가 true면 키고, false면 끔    void changeChannel(int channel);  // 인자로 전달 받은 채널 번호로 변경
    void changeChannerl(int channel);  // 체널 변경
    int getCurrentChannerl();  // 현재 채널을 확인
    boolean isPowerOn();  // TV의 전원이 켜져 있는지 여부 확인
    boolean isPaired();  // TV와 리모컨이 페이링 되어 있는지 반환
    void setPair(boolean pair);  // TV와 리모컨의 페어링 상태 반환
    String getTVName();  // TV의 이름 반환
}
