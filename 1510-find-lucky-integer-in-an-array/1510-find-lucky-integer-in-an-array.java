class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer, Integer> hm = new HashMap();

        for(int i = 0; i<arr.length; i++)
        {
            int elem = arr[i];
            if(hm.containsKey(elem) == true)
            {
                hm.put(elem, hm.get(elem) + 1);
            }
            else
            {
                hm.put(elem, 1);
            }
        }

        int ans = -1;

        for(int key : hm.keySet())
        {
            if(hm.get(key) == key)
            {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}