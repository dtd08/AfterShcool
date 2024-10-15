package clazz.exam3;

public class TVMain {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV("삼성 티븨");
        LGTV lgTv = new LGTV("엘지티븨");
        Remote universalRemote = new UniversalRemote();

        universalRemote.pairingTV(samsungTV);
        universalRemote.turnOnOffTv();
        universalRemote.changeChannel(5);
        universalRemote.printStreamingFuc();
        universalRemote.turnOnOffTv();

        System.out.println("=====================");

        universalRemote.pairingTV(lgTv);
        universalRemote.turnOnOffTv();
        universalRemote.changeChannel(10);
        universalRemote.printStreamingFuc();
        universalRemote.turnOnOffTv();
    }
}
