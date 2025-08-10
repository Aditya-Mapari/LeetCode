class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        
         Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // Base case
    int sum = 0, count = 0;

    for (int n : nums) {
        sum += n;

        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
        }

        if (map.containsKey(sum)) {
            map.put(sum, map.get(sum) + 1);
        } else {
            map.put(sum, 1);
        }
    }
    return count;
    }
}