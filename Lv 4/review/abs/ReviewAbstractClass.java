package review.abs;

import review.abs.camera.Camera;
import review.abs.camera.FactoryCam;
import review.abs.camera.SpeedCam;

public class ReviewAbstractClass {
    public static void main(String[] args) {
        // 추상 클래스는 필요한 것만 냅둔, 미완성된 클래스임
        // 따라서 추상 클래스를 인스턴스화 하려고 하면 오류남
        // Camera camera = new Camera();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

        // 다형성 활용도 잘 된다.
        Camera factoryCam2 = new FactoryCam();
        factoryCam2.recordVideo();
        factoryCam2.takePicture();
        factoryCam2.showMainFeature();
    }
}
