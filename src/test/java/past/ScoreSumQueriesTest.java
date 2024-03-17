package past;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import past.ScoreSumQueries;
import util.StandardInputStream;
import util.StandardOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ScoreSumQueriesTest {

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
        in.inputln("7");
        in.inputln("1 72");
        in.inputln("2 78");
        in.inputln("2 94");
        in.inputln("1 23");
        in.inputln("2 89");
        in.inputln("1 40");
        in.inputln("1 75");
        in.inputln("1");
        in.inputln("2 6");
        ScoreSumQueries.main(null);
        assertThat(out.readLine(), is("63 261"));
    }

}