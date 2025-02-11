package JavaGenerics;

enum GenericsinEnum{
    ADD,SUBTRACT,MULTIPLY,DIVIDE;
    public <T extends Number>double execute(T a,T b)
    {
        switch (this){
            case ADD :
                return a.doubleValue()+b.doubleValue();
            case SUBTRACT:
                return a.doubleValue()+b.doubleValue();
            case MULTIPLY:
                return a.doubleValue()* b.doubleValue();
            case DIVIDE:
                return b.doubleValue() != 0 ? a.doubleValue() / b.doubleValue() : Double.NaN;
            default:
                throw new UnsupportedOperationException("");
        }
    }
}
