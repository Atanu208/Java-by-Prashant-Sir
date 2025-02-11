package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class TestWildcard {
    public static void main(String[] args) {
        List<Integer> intList=List.of(1,2,3);
        List<String> stringList=List.of("A","B","C");
        UnboundedWildcard obj1=new UnboundedWildcard();
        obj1.printList(intList);
        obj1.printList(stringList);
        UpperBoundedWildcard obj2=new UpperBoundedWildcard();
        System.out.println(obj2.printArrat(intList));

        ArrayList<Number> numList=new ArrayList<>();
        LowerBoundedWildcard obj3=new LowerBoundedWildcard();
        obj3.addNumber(numList);
        System.out.println(numList);
    }
}
