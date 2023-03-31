package _23_03_31;

public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("urstory")

//        Bus2 b = new Bus2();
//        b.run();
//
//        SportCar s1 = new SportCar("sportsCar!!");
//        s1.run();
//
//        Car2 c = new Bus2();
//        c.run();

        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportCar(("sportsCar!!"));
        for(Car2 c2 : array){
            c2.run();
        }
    }
}