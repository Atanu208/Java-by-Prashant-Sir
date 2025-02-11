package JavaGenerics;

public class GenericMethod {
    public <T> void printArray(T[] array)
    {
        for (T element: array) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
