class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        for (int i = 0; i < s.length(); i++) {
            int value = 0;

            char ch = s.charAt(i);

            if (ch == 'I') value = I;
            else if (ch == 'V') value = V;
            else if (ch == 'X') value = X;
            else if (ch == 'L') value = L;
            else if (ch == 'C') value = C;
            else if (ch == 'D') value = D;
            else if (ch == 'M') value = M;

            // Check next character if exists
            if (i + 1 < s.length()) {
                char nextCh = s.charAt(i + 1);
                int nextValue = 0;

                if (nextCh == 'I') nextValue = I;
                else if (nextCh == 'V') nextValue = V;
                else if (nextCh == 'X') nextValue = X;
                else if (nextCh == 'L') nextValue = L;
                else if (nextCh == 'C') nextValue = C;
                else if (nextCh == 'D') nextValue = D;
                else if (nextCh == 'M') nextValue = M;

                if (value < nextValue) {
                    sum -= value; // subtract if smaller than next
                    continue;
                }
            }

            sum += value; // add normally
        }

        return sum;
    }
}
