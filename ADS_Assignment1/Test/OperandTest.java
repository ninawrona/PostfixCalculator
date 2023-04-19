import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    public Operand operand1;
    public Operand operand2;

    @BeforeEach
    void setUp() {
        operand1 = new Operand(3);
        operand2 = new Operand(-1);
    }

    @Test
    void getOperand_positive() {
        assertEquals(3, operand1.getOperand());
    }

    @Test
    void getOperand_negative() {
        assertEquals(-1, operand2.getOperand());
    }
}