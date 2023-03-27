package _23_03_27;

public class forExam {
    public static void main(String[] args){
        /*for(int i =1; i <=10; i++){
            System.out.println(i);*/
        //구구단 예제
        for(int k =1; k<=9; k++){
            for (int i = 1; i <= 9; i++){
                System.out.println(k + " * " + i + " = " + (k*i));
            }
            System.out.println();
        }
    }
}
