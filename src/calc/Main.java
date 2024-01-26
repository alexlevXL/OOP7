package calc;

import calc.operation.parser.CalcStringParser;
import calc.operation.parser.CorrectionParser;

public class Main {
    public static void main(String[] args) {
       final CalcStringParser calcStringParser = new CalcStringParser(new CorrectionParser());
       final Calculator calculator = new Calculator(calcStringParser);
       calculator.calculate(args);
    }
    
}
