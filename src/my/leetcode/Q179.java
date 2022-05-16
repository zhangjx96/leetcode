package my.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.cn/problems/largest-number/
 *
 * medium
 */
public class Q179 {

    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s, (o1, o2) -> (o1 + o2).compareTo(o1 + o2));

        StringBuilder s1 = new StringBuilder();
        for (String each : s) {
            s1.append(each);
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        String s = "10";

        String s1 = "2";

        int i = s.compareTo(s1);

        System.out.println(i);


        String[] ss = new String[]{s, s1};
        Arrays.sort(ss,(o1, o2) ->(o2 + o1).compareTo(o1 + o2));

        System.out.println();

        Q179 q179 = new Q179();
        q179.largestNumber(new int[]{10, 2});
    }
}
