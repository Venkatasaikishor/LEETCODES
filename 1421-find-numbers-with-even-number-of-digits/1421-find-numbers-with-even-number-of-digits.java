class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int ans=0;
            while(num>0){
            int digit=num%10;
            ans++;
            num/=10;
            }
            if(num==0){
                if(ans%2==0){
                    count++;
                }
            }
        }
        return count;
        
        
    }
}