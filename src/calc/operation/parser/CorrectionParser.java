package calc.operation.parser;


public class CorrectionParser implements ArgsParser{

    @Override
    public String[] parse(String[] calcArgs) {
        final String joining = String.join("", calcArgs);
        return joining.split("");
    }

    
}
