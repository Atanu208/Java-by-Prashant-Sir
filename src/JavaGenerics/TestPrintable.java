package JavaGenerics;

public class TestPrintable extends Number implements Printable {

    @Override
    public void print() {
        System.out.println("Hello World");
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
class Box<T extends Number & Printable>
{
    private T item;

    public Box(TestPrintable testPrintable) {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public void display()
    {
        item.print();
    }
}

class Test
{
    public static <testPrintable extends Number & Printable> void main(String[] args) {
        TestPrintable testPrintable=new TestPrintable();
        Box<testPrintable> obj=new Box<>(testPrintable);
    }
}