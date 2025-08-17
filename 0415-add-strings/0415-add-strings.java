class Solution {
    public String addStrings(String num1, String num2) {
        
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();

        int carry = 0;

        while(i >= 0 || j >= 0)
        {
            int nui = 0;
            int nuj= 0;
            
            if(i >= 0)
            {
                nui = num1.charAt(i) - '0';
            }
            else
            {
                 nui = 0;
            }
            if(j >= 0)
            {
                nuj= num2.charAt(j) - '0';
            }
            else
            {
                nuj = 0;
            }
              

            int sum = nui + nuj+ carry;
            sb.insert(0, sum%10);
             carry = sum/10;

            i--;
            j--;


        }
        if(carry > 0)
        {
            sb.insert(0,carry);
        }
        
        return sb.toString();


    }
}