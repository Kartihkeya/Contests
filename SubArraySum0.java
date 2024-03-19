class SubArraySum0{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0||arr[i]==0||map.containsKey(sum)){
                return true;
            }
            map.put(sum,i);
        }
        return false;
    }
}