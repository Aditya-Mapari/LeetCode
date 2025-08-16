class Solution {
    public int numSplits(String s) {

       
         Map<Character, Integer> leftMap = new HashMap<>();
        Map<Character, Integer> rightMap = new HashMap<>();
        
        // Fill right map with all character counts
        for (char ch : s.toCharArray()) {
            rightMap.put(ch, rightMap.getOrDefault(ch, 0) + 1);
        }
        
        int count = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            
            // Add to left
            leftMap.put(ch, leftMap.getOrDefault(ch, 0) + 1);
            
            // Remove from right
            rightMap.put(ch, rightMap.get(ch) - 1);
            if (rightMap.get(ch) == 0) {
                rightMap.remove(ch);
            }
            
            // Compare unique keys
            if (leftMap.size() == rightMap.size()) {
                count++;
            }
        }
        
        return count;
    }
}