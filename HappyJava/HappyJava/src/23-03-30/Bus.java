package _23_03_30;
// Bus는 자동차의 한 종류다
public class Bus extends Car{
    public void run(){
        System.out.println("후륜구동으로 달린다.");
    }

    public void 안내방송(){
        System.out.println("안내방송");
    }
}
