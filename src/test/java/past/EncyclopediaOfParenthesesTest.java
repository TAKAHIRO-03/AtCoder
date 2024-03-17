package past;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import past.EncyclopediaOfParentheses;
import util.StandardInputStream;
import util.StandardOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class EncyclopediaOfParenthesesTest {

    private StandardInputStream in = null;
    private StandardOutputStream out = null;

    @BeforeEach
    public void before() {
        in = new StandardInputStream();
        out = new StandardOutputStream();
        System.setIn(in);
        System.setOut(out);
    }

    @AfterEach
    public void after() {
        System.setIn(null);
        System.setOut(null);
        in = null;
        out = null;
    }

    @Test
    public void main01() {
        in.inputln("2");
        EncyclopediaOfParentheses.main(null);
        assertThat(out.readLine(), is("()"));
    }

    @Test
    public void main02() {
        in.inputln("3");
        EncyclopediaOfParentheses.main(null);
        assertThat(out.readLine(), is(nullValue()));
    }

    @Test
    public void main03() {
        in.inputln("4");
        EncyclopediaOfParentheses.main(null);
        assertThat(out.readLine(), is("(())"));
        assertThat(out.readLine(), is("()()"));
    }

}