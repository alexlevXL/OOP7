package calc.operation.parser;

public class MistakeParser implements ArgsParser{
    private static final String ALPHABET = " ";

    private ArgsParser parser;

    public MistakeParser(){
    }
    public MistakeParser(ArgsParser parser) {
            this.parser = parser;
        }


    @Override
    public String[] parse(String[] calcArgs) {
        final String joining = String.join( "", calcArgs);
        for (String arg : joining.split("")) {
            if (ALPHABET.contains(arg)) {
                throw new RuntimeException("недопустимый символ" + arg);
            }
        }
        // TODO Auto-generated method stub
        return parser != null ? parser.parse(calcArgs) : calcArgs; 

     }
}