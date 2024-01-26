package calc.operation;

public class SumOperation implements Operation{

    private final Number num1;
    private final Number num2;

    public SumOperation(Number num1, Number num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Number operate() {
        // TODO Auto-generated method stub
        return addNumber(num2, num1);
    }
    private Number addNumber(Number a, Number b) {
        if(a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
         }else if(a instanceof Float || b instanceof Float){
         return a.floatValue() + b.floatValue();

        }else if(a instanceof Long || b instanceof Long){
            return a.longValue() + b.longValue();
        }else {
            return a.intValue() + b.intValue();
        }
    }
    
}
