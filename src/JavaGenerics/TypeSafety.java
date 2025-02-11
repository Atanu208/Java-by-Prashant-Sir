package JavaGenerics;
//E used for collection
//K used for key
//V used for value
//N used for Number
//T used for interface
public class TypeSafety<N,A> {
    public N name;
    public A age;

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }
}
