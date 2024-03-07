package past;
import java.util.HashMap;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {

        var map = new HashMap<Integer, Integer>();
        for(var n : nums) {
            if(map.containsKey(n)) {
                return n;
            }
            map.put(n, n);
        }

        return -1;
    }    
}
