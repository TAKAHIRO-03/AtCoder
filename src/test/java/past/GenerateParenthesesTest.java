package past;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GenerateParenthesesTest {

    @Test
    public void test01() {
        var input = 3;
        var output = past.GenerateParentheses.generateParenthesis(input);
        assertThat(output, is(List.of("((()))", "(()())", "(())()", "()(())", "()()()")));
    }

    @Test
    public void test02() {
        var input = 4;
        var output = past.GenerateParentheses.generateParenthesis(input);
        assertThat(output, is(List.of("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())",
                "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()")));
    }

}
