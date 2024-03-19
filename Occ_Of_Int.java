class Occ_Of_Int
{
    public static int count(Node head, int key)
    {
        Node curr=head;
        int count=0;
        while(curr!=null){
            if(curr.data==key){
                count++;
                curr=curr.next;
                
            }
            else{
                curr=curr.next;
                
            }
        }
        return count;
    }
}