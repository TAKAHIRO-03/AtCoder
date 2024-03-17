package past;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import past.CrossSum;
import util.StandardInputStream;
import util.StandardOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CrossSumTest {

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
        in.inputln("3 3");
        in.inputln("1 1 1");
        in.inputln("1 1 1");
        in.inputln("1 1 1");
        CrossSum.main(null);
        assertThat(out.readLine(), is("5 5 5"));
        assertThat(out.readLine(), is("5 5 5"));
        assertThat(out.readLine(), is("5 5 5"));
    }

    @Test
    public void main02() {
        in.inputln("4 4");
        in.inputln("3 1 4 1");
        in.inputln("5 9 2 6");
        in.inputln("5 3 5 8");
        in.inputln("9 7 9 3");
        CrossSum.main(null);
        assertThat(out.readLine(), is("28 28 25 26"));
        assertThat(out.readLine(), is("39 33 40 34"));
        assertThat(out.readLine(), is("38 38 36 31"));
        assertThat(out.readLine(), is("41 41 39 43"));
    }

    @Test
    public void main03() {
        in.inputln("2 10");
        in.inputln("31 41 59 26 53 58 97 93 23 84");
        in.inputln("62 64 33 83 27 95 2 88 41 97");
        CrossSum.main(null);
        assertThat(out.readLine(), is("627 629 598 648 592 660 567 653 606 662"));
        assertThat(out.readLine(), is("623 633 651 618 645 650 689 685 615 676"));
    }

    @Test
    public void main04() {
        in.inputln("2 10");
        in.inputln("31 41 59 26 53 58 97 93 23 84");
        in.inputln("62 64 33 83 27 95 2 88 41 97");
        CrossSum.main(null);
        assertThat(out.readLine(), is("627 629 598 648 592 660 567 653 606 662"));
        assertThat(out.readLine(), is("623 633 651 618 645 650 689 685 615 676"));
    }



}