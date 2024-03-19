class FairArray {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int[] prefixSumOdd = new int[n + 1];
        int[] prefixSumEven = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixSumOdd[i + 1] = prefixSumOdd[i] + (i % 2 == 1 ? nums[i] : 0);
            prefixSumEven[i + 1] = prefixSumEven[i] + (i % 2 == 0 ? nums[i] : 0);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sumOdd = prefixSumOdd[i] + prefixSumEven[n] - prefixSumEven[i + 1];
            int sumEven = prefixSumEven[i] + prefixSumOdd[n] - prefixSumOdd[i + 1];
            if (sumOdd == sumEven) {
                count++;
            }
        }
        
        return count;
    }
}