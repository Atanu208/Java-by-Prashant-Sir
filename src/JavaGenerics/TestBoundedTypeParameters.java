package JavaGenerics;

public class TestBoundedTypeParameters {
    public static void main(String[] args) {
        BoundedTypeParameters<Integer> intObj=new BoundedTypeParameters<>();
        intObj.age=23;
        intObj.roll=231231423;
        BoundedTypeParameters<Float> FloatObj=new BoundedTypeParameters<>();
        FloatObj.age=4585.98f;
        System.out.println("age:"+intObj.age);
        System.out.println("roll:"+intObj.roll);
        System.out.println("Float age:"+FloatObj.age);

    }
}
