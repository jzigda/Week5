package am.iunetworks.jigme;

public class Qn6 {
    static class Solution {
        public char[] reverseString(char[] s) {
            int i=0;
            int j=s.length-1;
            while (i<=j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
            return s;
        }
    }
    public static void  main(String[] args){
        char[] a = {'H', 'e', 'l', 'l', 'o'};
        Solution s = new Solution();
        System.out.println(s.reverseString(a));
        }
    }

