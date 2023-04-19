public class Operand implements TokenInterface{

    int operand;

    public Operand(int op){
        this.operand = op;
    }

    public int getOperand() {
        return operand;
    }

    @Override
    public boolean isDigit() {
        return true;
    }
}
