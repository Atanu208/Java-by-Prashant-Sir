package JavaGenerics;

public class BoundedTypeParameters <T extends Number>{
    T roll;
    T age;
    T salary;

    public T getRoll() {
        return roll;
    }

    public void setRoll(T roll) {
        this.roll = roll;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }
}
