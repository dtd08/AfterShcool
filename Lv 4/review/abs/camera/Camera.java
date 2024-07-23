package review.abs.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }
    
    // 각 카메라의 특징
    public abstract void showMainFeature(); // 추상메서드 - 하위 클래스에서 구현해야 하는 메서드
}

// 추상 메서드
// 인터페이스와 다른 점은 메서드를 구현할 수 있다는 점이다.