import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) 
    {
    
       Set<Integer> st = new HashSet<>();
    for (int num : nums) {
        st.add(num);
    }

    int maxCount = 0;

    for (int num : st) {
        // Only start counting if this is the start of a sequence
        if (!st.contains(num - 1)) {
            int currentNum = num;
            int count = 1;

            while (st.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }
    }
    return maxCount;
        
    }
}
