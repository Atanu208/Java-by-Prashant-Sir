package JavaGenerics;

import java.util.List;

public class UnboundedWildcard {
    public static void printList(List<?> list)
    {
        for (Object obj:list) {
            System.out.print(obj+" ");
        }
        System.out.println();
    }
}
