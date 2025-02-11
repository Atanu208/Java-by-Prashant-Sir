package JavaGenerics;

import java.util.List;

public class UpperBoundedWildcard {
    double sum=0;
    public double printArrat(List<? extends Integer>list)
    {
        for (Number obj: list) {
            sum +=obj.doubleValue();
        }
        return sum;
    }
}
