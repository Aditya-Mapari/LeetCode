class Solution {
    public int beautySum(String s) {
           int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hm = new HashMap<>(); // new map for each starting index

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                int maxValue = Integer.MIN_VALUE;
                int minValue = Integer.MAX_VALUE;

                for (int num : hm.values()) {
                    if (num > maxValue) {
                        maxValue = num;
                    }
                    if (num < minValue) {
                        minValue = num;
                    }
                }

                sum += maxValue - minValue;
            }
        }

        return sum;
    }
}