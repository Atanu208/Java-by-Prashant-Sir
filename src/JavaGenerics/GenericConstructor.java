package JavaGenerics;

public class GenericConstructor<T> {
    private T data;
    <U> GenericConstructor(U value)
    {
        System.out.print("Receive: "+value);
    }
}

