class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n= nums.length; //lenght n array create
        int ans[]= new int[2*n]; //double lenght answer array create

        for(int i=0; i<n; i++) {
            ans[i] = nums[i]; //i=0,1,2,3
            ans[i + n] = nums[i];    //n= lenght added array
        }

        return ans;
    }
}