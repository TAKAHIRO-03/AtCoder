package past;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import past.CreateTargetArrayInTheGivenOrder;
import util.StandardInputStream;
import util.StandardOutputStream;

public class CreateTargetArrayInTheGivenOrderTest {

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
        in.inputln("5");
        in.inputln("1 2 3 4 0");
        in.inputln("0 1 2 3 0");
        CreateTargetArrayInTheGivenOrder.main(null);
        assertThat(out.readLine(), is("[0, 1, 2, 3, 4]"));
    }

}
