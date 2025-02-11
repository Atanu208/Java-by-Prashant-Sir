package JavaGenerics;

import java.util.List;

public class LowerBoundedWildcard {
    public void addNumber(List<? super Integer>list)
    {
        list.add(10);
        list.add(20);
    }
}
