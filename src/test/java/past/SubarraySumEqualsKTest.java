package past;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SubarraySumEqualsKTest {

    @Test
    public void test01() {
        var inputAry = new int[] { 1, 1, 1 };
        var inputNum = 2;
        var output = past.SubarraySumEqualsK.subarraySum(inputAry, inputNum);
        assertThat(output, is(2));
    }

    @Test
    public void test02() {
        var inputAry = new int[] { 1, -1, 0 };
        var inputNum = 0;
        var output = past.SubarraySumEqualsK.subarraySum(inputAry, inputNum);
        assertThat(output, is(3));
    }

}
