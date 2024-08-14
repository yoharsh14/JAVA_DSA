package ALgos;

import java.util.List;

public class LinkedL {
     static  ListNode head; // Head node to hold the list
    //it contains a static inner class ListNode
    private  static class ListNode{
        private  int data ;
        private  ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        //Let's create a single linked list
        //10-->8-->1-->11-->null

        //10 as head node od linked list
        head = new ListNode(10);
        ListNode second= new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode forth = new ListNode(11);
        //Attach them together to form a list
        head.next = second;//10-->8
        second.next = third;
        third.next = forth;
        forth.next = null;
        head = reverseIteration(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        }
    static ListNode reverseIteration(ListNode head){
        ListNode prev = null;
        ListNode next ;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
        return head;
    }
}
