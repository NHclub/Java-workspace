package _23_04_05;

public class GenericBox<T> {
    private T t;
    public void set(T obj){
        this.t = obj;
    }

    public T get(){
        return this.t;
    }
}
