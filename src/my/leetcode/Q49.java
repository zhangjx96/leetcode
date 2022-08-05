package my.leetcode;

import java.util.*;

/**
 * https://leetcode.cn/problems/group-anagrams/
 */
public class Q49 {



    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] cnt = new int[26];
            for (char c : s.toCharArray())
                cnt[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++)
                if(cnt[i]>0)
                    sb.append((char) 'a' + i).append(cnt[i]);
            if(map.containsKey(sb.toString()))
                map.get(sb.toString()).add(s);
            else
                map.put(sb.toString(), new ArrayList<>(Collections.singletonList(s)));

        }

        return new ArrayList<>(map.values());
    }


}
