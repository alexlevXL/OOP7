package calc.operation.parser;

import calc.operation.Operation;
import calc.operation.SumOperation;


public class CalcStringParser {
    
    private ArgsParser parser;
    public CalcStringParser(ArgsParser parser) {
    this.parser = parser;
    }
    public Operation parse(String[] calcArgs) {
        final String[] parsedArgs = parser != null ? parser.parse(calcArgs) : calcArgs;
        final String firstOperand = calcArgs[0];
        final Number firstValue;
        if (firstOperand.contains(",")){
            firstValue = Double.valueOf(firstOperand);
        }else {
            firstValue = Long.valueOf(firstOperand);
        }
        final String secondOperand = calcArgs[2];
        final Number secondValue;
        if (secondOperand.contains(".")) {
            secondValue = Double.valueOf((secondOperand));
        }else {
            secondValue = Long.valueOf(secondOperand);
        }
        return new SumOperation(firstValue, secondValue);
    }
    
}
