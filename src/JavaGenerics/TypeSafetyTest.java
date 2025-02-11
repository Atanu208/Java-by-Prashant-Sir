package JavaGenerics;

public class TypeSafetyTest {
    public static void main(String[] args) {
        TypeSafety<String,Integer> obj=new TypeSafety<>();
        obj.setName("Atanu");
        obj.setAge(21);
        System.out.println("Name:" + obj.getName());
        System.out.println("Age:"+ obj.getAge());
    }
}
