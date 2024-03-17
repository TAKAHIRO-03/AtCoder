package past;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import past.FindAllAnagramsInAString;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FindAllAnagramsInAStringTest {

    @Test
    public void test01() {
        var input1 = "cbaebabacd";
        var input2 = "abc";
        var expected = Arrays.asList(0, 6);
        var actual = FindAllAnagramsInAString.findAnagrams(input1, input2);

        assertThat(actual, is(expected));
    }

    @Test
    public void test02() {
        var input1 = "abacbabc";
        var input2 = "abc";
        var expected = Arrays.asList(1, 2, 3, 5);
        var actual = FindAllAnagramsInAString.findAnagrams(input1, input2);

        assertThat(actual, is(expected));
    }

}
