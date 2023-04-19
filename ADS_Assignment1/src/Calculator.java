import java.util.ArrayList;

public class Calculator implements CalculatorAPI{

    Stack<TokenInterface> stack;

    public Calculator(){
        stack = new Stack<TokenInterface>();
    }



    @Override
    public int evaluateExpression(ArrayList<TokenInterface> tokens) throws Exception {
        int size;
        while (tokens.size() > 0) {
            size = tokens.size();
            if (tokens.get(size-1).isDigit()) {
                stack.push(tokens.get(size-1));
                tokens.remove(size-1);
            } else {
                Operand opRight = (Operand) stack.pop();
                Operand opLeft = (Operand) stack.pop();
                Operator operator = (Operator) tokens.get(size-1);
                tokens.remove(size-1);
                stack.push(operator.performOperator(opLeft.getOperand(), opRight.getOperand()));
            }
        }

        Operand last = null;

        if(stack.peek() instanceof Operand){
            System.out.println(stack.isEmpty());
            last = (Operand)stack.pop();
        }

        return last.getOperand();
    }
}
