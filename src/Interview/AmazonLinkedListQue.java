package Interview;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}

public class AmazonLinkedListQue {
    public static int solve(ListNode root){
        if(root.next==null) {
            if(root.val+1>=10){
                root.val = (root.val+1)%10;
                return 1;
            }
            return 0;
        }

        int remainder = solve(root.next);
        int sum=0,remain=0;
        if(remainder>0) {
             if((root.val+remainder)>=10) {
                root.val = (root.val+remainder)%10;
                 return 1;
             }else{
                 root.val = (root.val+remainder);
                 return 0;
             }
        }
        return 0;
    }
    public static void print(ListNode root){

        ListNode ptr = root;
        while(ptr!=null){
            System.out.print(ptr.val+" ");
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        ListNode dummyhead = new ListNode(0);
        ListNode root = dummyhead;
        int[] arr = {9,9,9};
        for(int i:arr){
            dummyhead.next = new ListNode(i);
            dummyhead = dummyhead.next;
        }
        ListNode head= root.next;
        int rm = solve(root.next);
        if(rm>0){
            ListNode temp = new ListNode(1);
            temp.next = head;
            print(temp);
        }else{
            print(head);
        }
    }



}
