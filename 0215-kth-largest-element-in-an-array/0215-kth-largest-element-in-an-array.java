class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        int element =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums)
        {
            pq.add(num);

        }

        for(int i = 0; i<k; i++)
        {
            element = pq.poll();
        }
        return element;
    }
}