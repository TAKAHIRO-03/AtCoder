package past;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import past.YokanParty;
import util.StandardInputStream;
import util.StandardOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class YokanPartyTest {

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
        in.inputln("3 34");
        in.inputln("1");
        in.inputln("8 13 26");
        YokanParty.main(null);
        assertThat(out.readLine(), is("13"));
    }

    @Test
    public void main02() {
        in.inputln("7 45");
        in.inputln("2");
        in.inputln("7 11 16 20 28 34 38");
        YokanParty.main(null);
        assertThat(out.readLine(), is("12"));
    }

    @Test
    public void main03() {
        in.inputln("3 100");
        in.inputln("1");
        in.inputln("28 54 81");
        YokanParty.main(null);
        assertThat(out.readLine(), is("46"));
    }

    @Test
    public void main04() {
        in.inputln("3 100");
        in.inputln("2");
        in.inputln("28 54 81");
        YokanParty.main(null);
        assertThat(out.readLine(), is("26"));
    }

    @Test
    public void main05() {
        in.inputln("20 1000");
        in.inputln("4");
        in.inputln("51 69 102 127 233 295 350 388 417 466 469 523 553 587 720 739 801 855 926 954");
        YokanParty.main(null);
        assertThat(out.readLine(), is("170"));
    }

}