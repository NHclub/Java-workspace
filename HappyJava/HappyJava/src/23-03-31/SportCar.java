package _23_03_31;

public class SportCar extends Car2{
    // 부모가 기본생성자가 없기때문에 반드시 super() 를 호출한다.
    public SportCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");
    }
}
