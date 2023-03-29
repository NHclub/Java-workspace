package _23_03_29;

public class Person {
    String name;
    String address;
    boolean isVip;
    int a;
    static int count = 0; // 클래스 필드
    static {
        count = 100;
    }

    public void printName(){ // 인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }

    public static void printCount(){ // 클래스 메소드
//        System.out.println(name); // static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
        System.out.println("count : "+count);
    }
}
