import java.util.ArrayList;

public interface CalculatorAPI {
    int evaluateExpression(ArrayList<TokenInterface> tokens) throws Exception;
}
