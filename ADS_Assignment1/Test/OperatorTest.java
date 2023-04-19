import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    public Operator operator1;
    public Operator subtraction;
    public Operator multiplication;
    public Operator division;
    public Operator operator2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        operator1 = new Operator("+");
        subtraction = new Operator("-");
        multiplication = new Operator("*");
        division = new Operator("/");
        operator2 = new Operator("#");
    }

    @org.junit.jupiter.api.Test
    void getOperator() {
        assertEquals("+", operator1.getOperator());
    }

    @org.junit.jupiter.api.Test
    void performOperator_addition() throws Exception {
        assertEquals(7, operator1.performOperator(3, 4).getOperand());

    }

    @org.junit.jupiter.api.Test
    void performOperator_subtraction() throws Exception {
        assertEquals(1, subtraction.performOperator(5, 4).getOperand());
    }

    @org.junit.jupiter.api.Test
    void performOperator_subtraction_negativeResult() throws Exception {
        assertEquals(-1, subtraction.performOperator(3, 4).getOperand());
    }

    @org.junit.jupiter.api.Test
    void performOperator_multiplication() throws Exception {
        assertEquals(20, multiplication.performOperator(5, 4).getOperand());
    }

    @org.junit.jupiter.api.Test
    void performOperator_division() throws Exception {
        assertEquals(2, division.performOperator(8, 4).getOperand());
    }

    @org.junit.jupiter.api.Test
    void performOperator_division_exception() throws Exception {
        assertThrows(IllegalArgumentException.class, ()-> division.performOperator(2, 4).getOperand());
    }


    @org.junit.jupiter.api.Test
    void performOperator_no_exception() {
        assertDoesNotThrow(() -> operator1.performOperator(3, 4));
    }

    @org.junit.jupiter.api.Test
    void performOperator_exception() {
        assertThrows(IllegalArgumentException.class, () -> operator2.performOperator(3, 4));
    }
}