class Solution {
    public String reverseWords(String s) 
    {
        s = s.trim();
        if(s.length() == 1)
        {
            return s;
        }
        
        String []st = s.split(" ");

        ArrayList<String> al = new ArrayList<>();

        for(String sg : st)
        {
           if (!sg.isEmpty())
            {
                al.add(sg);
            }
        }

        int left = 0;
        int right = al.size() - 1;

        while(left < right)
        {
            String temp = al.get(left);
            al.set(left, al.get(right));
            al.set(right, temp);

            left++;
            right--;
        }

        String result = String.join(" ",al);

        return result;
       
    }
}