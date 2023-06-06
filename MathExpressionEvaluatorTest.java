import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class MathExpressionEvaluatorTest {
    @Test
    public void testEvaluateExpression() throws IOException {
        String expression1 = "2*4*4";
        String result1 = MathExpressionEvaluator.evaluateExpression(expression1);
        Assertions.assertEquals("32", result1);

        String expression2 = "5/(7-5)";
        String result2 = MathExpressionEvaluator.evaluateExpression(expression2);
        Assertions.assertEquals("2.5", result2);
    }
    }



