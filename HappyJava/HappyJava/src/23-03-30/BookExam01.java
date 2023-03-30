package _23_03_30;

public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.price = 100; // private한 필드는 외부에서 접근하지 못함
//        System.out.println(b1.price);

        b1.setTitle("김성박의 즐거운 자바");
        b1.setPrice(500);
        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());


    }
}
