package JavaGenerics;
interface Displayable
{
    void display();
}
class Data
{
    void showData() {
        System.out.println("Showing data...");
    }
}
class BoundedType<T extends Data & Displayable>
{
    private T obj;

    public BoundedType(T obj) {
        this.obj = obj;
    }
    public void execute()
    {
        obj.display();
        obj.showData();
    }
}
class MyClass extends Data implements Displayable
{
    @Override
    public void display() {
        System.out.println("Displaying data...");
    }
}
public class TestBoundedType {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        BoundedType<MyClass> BoundedTypeObj=new BoundedType<>(obj);
        BoundedTypeObj.execute();
    }
}
