class Solution {
    public int findDuplicate(int[] arr) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                return i;
            }
            else{
                map.put(i,1);
            }
        }
        return -1;
    }
    // public int findDuplicate(int[] arr) 
    // {
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         if(arr[i]==arr[i+1])
    //         {
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    // public int findDuplicate(int[] nums) 
    // {
    //     int element = 0;
    //     for(int i =0; i<nums.length; i++)
    //     {
    //        element = nums[i];
    //         element = Math.abs(element);


    //         if(nums[element] > 0)
    //         {
    //             nums[element] = -nums[element];
    //         }
    //     else
    //         {
    //             return element;
                
    //         }
    //     }
       
    //     return -1;
       
    // }
}