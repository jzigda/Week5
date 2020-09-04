package am.iunetworks.jigme;

import java.util.HashSet;
import java.util.Set;

public class Qn4 {
    static class Solution1 {
        public String customSortString(String S, String T) {
            int[] count = new int[26];
            for (int i = 0; i < T.length(); i++)
                count[T.charAt(i) - 'a']++;
            Set<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            // first add all characters in S string plus duplicates in T
            for (int i = 0; i < S.length(); i++) {
                set.add(S.charAt(i));
                int num = count[S.charAt(i) - 'a'];
                for (int j = 0; j < num; j++)
                    sb.append(S.charAt(i));
            }
            // at the end, add all chatacters in T that are not in S
            for (int i = 0; i < T.length(); i++) {
                if (!set.contains(T.charAt(i)))
                    sb.append(T.charAt(i));
            }
            return sb.toString();
        }
    }
    public static void  main (String[] args){
        String S = "cba";
        String T = "abcd";
        Solution1 s= new Solution1();
        System.out.println(s.customSortString(S, T));



    }
}
