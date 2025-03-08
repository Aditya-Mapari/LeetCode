class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() == 1)
        {
            return false;
        }
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch =='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else 
            {
                
               if(st.size() > 0 && st.peek() == '(' && ch ==')')
               {
                    st.pop();
               }
              else if(st.size() > 0 && st.peek() == '[' && ch ==']')
               {
                    st.pop();
               }
               else if(st.size() > 0 && st.peek() == '{' && ch =='}')
               {
                    st.pop();
               }
               else
               {
                    return false;
               }
               
               
            }
            
        }

        if(st.size() == 0)
        {
            return true;
        }
        return false;

        

        
    }
}