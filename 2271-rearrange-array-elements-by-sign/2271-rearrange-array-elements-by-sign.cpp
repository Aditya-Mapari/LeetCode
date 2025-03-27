class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
         int n = nums.size();

        vector<int> pos, neg, res(n);

        // Separate positive and negative numbers in one pass
        for (int num : nums) {
            if (num > 0) pos.push_back(num);
            else neg.push_back(num);
        }

        // Merge positive and negative numbers alternately
        int j = 0;
        for (int i = 0; i < n; i += 2) {
            res[i] = pos[j];
            res[i + 1] = neg[j];
            j++;
        }

        return res;
    }
};