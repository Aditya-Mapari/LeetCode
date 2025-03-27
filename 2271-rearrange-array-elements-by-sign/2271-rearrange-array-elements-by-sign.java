class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int [] result = new int[nums.length];
ArrayList<Integer> pos=new ArrayList<>();
ArrayList<Integer> neg=new ArrayList<>();
int pcount=0;
int ncount=0;

       for(int i=0;i<nums.length;i++){
if(nums[i]<0){
    neg.add(nums[i]);
    ncount++;
}
else{
    pos.add(nums[i]);
    pcount++;
}
       }
       System.out.println(pos.toString());
              System.out.println(neg.toString());

       pcount=0;
       ncount=0;
       int rcount=0;

       for(int i=1;i<=nums.length;i++){
        if(i%2==0)
        {
result[rcount]=neg.get(ncount);
ncount++;
        }
        else{
result[rcount]=pos.get(pcount);
pcount++;
        }
        rcount++;



       }
        return result;
    }
}