package JavaGenerics;

public class TestGenericInterface<T> implements GenericInterface<T>{
    private T name;
    @Override
    public void name(T name) {
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        TestGenericInterface<String> obj1=new TestGenericInterface<>();
        obj1.name("Atanu");
        TestGenericInterface<Integer> obj2=new TestGenericInterface<>();
        obj2.name(231);
    }
}
