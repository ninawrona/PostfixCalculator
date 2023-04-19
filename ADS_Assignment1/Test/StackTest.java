import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;
    Stack stack1;

    @BeforeEach
    void setUp() {
        stack = new Stack();
        stack1 = new Stack();
        stack1.push(3);
        stack1.push(1);
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmpty_notEmpty() {
        assertFalse(stack1.isEmpty());
    }

    @Test
    void peek() {
        assertEquals(1, stack1.peek());
    }

    @Test
    void peek_nullValue() {
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }

    @Test
    void pop() {
        assertEquals(1, stack1.pop());
    }

    @Test
    void pop_emptyStack() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    void push_one() {
        stack.push(0);
        assertEquals(0, stack.pop());
    }

    @Test
    void push_multiple() {
        stack.push(0);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }
}