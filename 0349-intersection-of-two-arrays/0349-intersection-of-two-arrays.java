class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> al = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int j = 0,i=0;
        while(i<nums1.length)
        {
            if(nums1[i]==nums2[j]){
                al.add(nums2[j]);
                i++;
                System.out.println("i is "+i+" j is  jj "+j);
                j++;
            }
            else if(nums1[i]<nums2[j]){
                 i++;
            }
            else {
                j++;
            }
    System.out.println("i is "+i+" j is "+j);
            if(i>=nums1.length || j >=nums2.length){
                System.out.println("j is "+j);
                break;
            }

            
         
        }
        int[] arr = new int[al.size()];
        int index = 0;
        for (int num : al) {
            arr[index++] = num;
        }
        return arr;

    }
}