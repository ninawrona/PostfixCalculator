public class Operator implements TokenInterface{


    String operator;

    public Operator(String op){
        this.operator = op;
    }

    @Override
    public boolean isDigit() {
        return false;
    }

    public String getOperator() {
        return operator;
    }

    public Operand performOperator(int a, int b) throws Exception {
        switch (operator){
            case "+":
                return new Operand(a+b);
            case "-":
                return new Operand(a-b);
            case "*":
                return new Operand(a*b);
            case "/":
                if(a%b != 0){
                    throw new IllegalArgumentException(a + "cannot be divided without a reminder with " + b);
                }
                return new Operand(a/b);
            default:
                throw new IllegalArgumentException("Incorrect operand");
        }


    }
}
