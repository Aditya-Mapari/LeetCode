class Solution {
    public boolean isPowerOfFour(int n) {
return check(0,n);
        
    }
    static boolean check(int x,int no){
        if(Math.pow(4,x)==no){
            return true;
        }
        else if(Math.pow(4,x)>no){
            return false;
        }
        return check(x+1,no);
    }
}