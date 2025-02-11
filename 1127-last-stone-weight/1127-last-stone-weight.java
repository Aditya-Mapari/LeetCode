class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int element : stones)
        {
            pq.add(element);
        }

        while(pq.size() > 1)
        {
            int fstone = pq.remove();
            int sstone = pq.remove();

            int nstone = fstone - sstone;

            if(nstone != 0)
            {
                pq.add(nstone);
            }
        }
        if(pq.size() == 0)
        {
            return 0;
        }
        else
        {
            return pq.remove();
        }

    }
}