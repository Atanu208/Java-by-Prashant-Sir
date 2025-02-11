package JavaGenerics;

public class TestGenericmethod {
    public static void main(String[] args) {
        GenericMethod obj=new GenericMethod();
        Integer[] intArray={12,21,32,42,45,74};
        String[] stringArray={"Atanu","Mondal","Sam","Curren"};
        obj.printArray(intArray);
        obj.printArray(stringArray);
    }
}
