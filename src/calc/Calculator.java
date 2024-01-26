package calc;

import calc.operation.Operation;
import calc.operation.parser.CalcStringParser;

public class Calculator {

    private static final String START_RESULT_STRING = "= ";

    private CalcStringParser calcStringParser;

    public Calculator(CalcStringParser calcStringParser) {
      this.calcStringParser = calcStringParser;
    }

    public void calculate(String[] calcArgs) {
        
        final Operation operation = calcStringParser.parse(calcArgs);
        System.out.println(START_RESULT_STRING + operation.operate()); 
        
    }
}
