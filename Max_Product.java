//Max Product of Three Numbers
class Max_Product {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c1=nums[0]*nums[1]*nums[n-1];
        int c2=nums[n-3]*nums[n-2]*nums[n-1];
        return Math.max(c1,c2);
    }
}