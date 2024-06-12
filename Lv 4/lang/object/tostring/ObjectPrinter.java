package lang.object.tostring;

public class ObjectPrinter {

    public static void print(Object obj) {
        String str = "객체 정보 출력: " +obj.toString();  // 넘어온 객체의 toStirng() 출력
        System.out.println(str);
    }
}
