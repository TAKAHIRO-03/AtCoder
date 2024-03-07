package past;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeastNumberOfUniqueIntegersAfterKRemovals {

    public static void main(String[] args) {

        var input = new int[] { 2, 1, 1, 3, 3, 3 };
        var ans = findLeastNumOfUniqueInts(input, 3);
        System.out.println(ans);

    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        var map = new HashMap<Integer, Integer>();
        for (var a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
                continue;
            }
            map.put(a, 1);
        }

        var list = new ArrayList<>(map.values());
        Collections.sort(list);

        for (int i = 0, len = list.size(); i < len; i++) {
            var v = k - list.get(i);
            if (v < 0) {
                return len - i;
            }
            k = v;
        }

        return 0;
    }

    // private static class Removal implements Comparator<Removal> {

    // private Integer key;
    // private Integer count;

    // private Removal(Integer key, Integer count) {
    // this.key = key;
    // this.count = count;
    // }

    // @Override
    // public int compare(Removal o1, Removal o2) {
    // return o1.count.compareTo(o2.count);
    // }

    // public void incrementCount() {
    // this.count++;
    // }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((key == null) ? 0 : key.hashCode());
    // return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Removal other = (Removal) obj;
    // if (key == null) {
    // if (other.key != null)
    // return false;
    // } else if (!key.equals(other.key))
    // return false;
    // return true;
    // }

    // }

}
