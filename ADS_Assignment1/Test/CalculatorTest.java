import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void evaluateExpression_division() throws Exception {
        ArrayList<TokenInterface> array = new ArrayList<>();
        array.add(new Operator("/"));
        array.add(new Operand(3));
        array.add(new Operand(6));
        assertEquals(2, calculator.evaluateExpression(array));
    }

    @Test
    void evaluateExpression_multiplication() throws Exception {
        ArrayList<TokenInterface> array = new ArrayList<>();
        array.add(new Operator("*"));
        array.add(new Operand(6));
        array.add(new Operand(3));
        assertEquals(18, calculator.evaluateExpression(array));
    }
    @Test
    void evaluateExpression_subtraction() throws Exception {
        ArrayList<TokenInterface> array = new ArrayList<>();
        array.add(new Operator("-"));
        array.add(new Operand(3));
        array.add(new Operand(6));
        assertEquals(3, calculator.evaluateExpression(array));
    }

    @Test
    void evaluateExpression_subtraction_negativeResult() throws Exception {
        ArrayList<TokenInterface> array = new ArrayList<>();
        array.add(new Operator("-"));
        array.add(new Operand(6));
        array.add(new Operand(3));
        assertEquals(-3, calculator.evaluateExpression(array));
    }

    @Test
    void evaluateExpression_addition() throws Exception {
        ArrayList<TokenInterface> array = new ArrayList<>();
        array.add(new Operator("+"));
        array.add(new Operand(6));
        array.add(new Operand(3));
        assertEquals(9, calculator.evaluateExpression(array));
    }

    @Test
    void evaluateExpression_Exception() throws Exception {
        ArrayList<TokenInterface> array = new ArrayList<>();
        array.add(new Operator("#"));
        array.add(new Operand(6));
        array.add(new Operand(3));
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression(array));
    }
}