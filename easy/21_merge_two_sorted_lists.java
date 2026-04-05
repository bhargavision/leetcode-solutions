package easy;

class Solution{
    public: ListNode mergeTwoLists(ListNode* list1, ListNode* list2){
        
        /* int m=list1.size();
        int n=list2.size();
        ListNode* ls=new ListNode<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(list1.get(i)<=list2.get(j)){
                    ls.add(ls.add(get(i)));
                } else {
                    ls.add(ls.add(get(j)));
                }
            }
            
        } */
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=list1;
            } else {
                curr.next=list2;
                ok wait.
            }
        } 

    }
}
