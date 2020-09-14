package week6;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 ;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate) count+=1;
            else count-=1;
        }
        return candidate;
    }
}

public class Qn1 {
    public static void main(String[] args){
        int[] input = {2,2,1,1,1};
        Solution s = new Solution();
        System.out.println(s.majorityElement(input));

    }
}
