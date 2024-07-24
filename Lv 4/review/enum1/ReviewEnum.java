package review.enum1;

public class ReviewEnum {
    // switch 문을 사용한 Enum
    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println("resolution = " + resolution);
        System.out.println();

        resolution = Resolution.FHD;
        System.out.println("resolution = " + resolution);

        System.out.println();

        System.out.print("동영상 녹화 품질: ");
        switch (resolution) {
            case HD:
                System.out.println("일반 화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD"); // String을 enum 상수로 변환  // 서치 필요
        System.out.println("resolution = " + resolution);

        System.out.println();

        for (Resolution myRes : Resolution.values()) { // 열거형에 담긴 모든 값들(배열)
            System.out.println(myRes.name() + " : " + myRes.ordinal()); // 열거형 이름 + 순서
        }

        System.out.println("-----------------");

        for (Resolution myRes : Resolution.values()) { // 열거형에 담긴 모든 값들(배열)
            System.out.println(myRes.name() + " : " + myRes.getWidth()); // 열거형 이름 + 순서
        }
    }
}

// 참고로 한 파일에 여러 클래스가 있을 수 있지만, public 클래스는 하나만 있어야 한다.
enum Resolution {
    HD(1280),
    FHD(1920),
    UHD(3840); // 파라미터가 들어가는 경우 ;을 적어줌

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}