package _23_03_29;

public class Hello2 {
    static int i;
    static{
        i=500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

//Hell2.java 소스를 컴파일하고 java로 실행을 하면,
//JVM은 CLASSPATH에서 Hello2클래스를 찾게 됩니다.