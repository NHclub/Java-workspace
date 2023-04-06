package _23_04_06;

public class Exception01 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        try{
            int value = exobj.divide(10, 0);
            System.out.println(value);
        }catch(ArithmeticException ex){
            System.out.println("0으로 나눌수 없습니다");
        }


    }
}

