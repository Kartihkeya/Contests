class SingleNum {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count=map.get(nums[i])+1;
                map.put(nums[i],count);
            }
            else{
                map.put(nums[i],1);
            }
            
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                res=nums[i];
                
            }
        }
        return res;
        
    }
}