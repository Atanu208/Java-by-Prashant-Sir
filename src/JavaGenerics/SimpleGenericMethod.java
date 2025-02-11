package JavaGenerics;

public class SimpleGenericMethod {
    public <T> void print(T data)
    {
        System.out.println("Data : " +data);
    }
    public <T,U> void display(T first,U second)
    {
        System.out.println("First : "+first);
        System.out.println("Second : "+second);
    }
    public <T extends Number>void add(T a,T b)
    {
        System.out.println(a.doubleValue()+b.doubleValue());
    }
}
