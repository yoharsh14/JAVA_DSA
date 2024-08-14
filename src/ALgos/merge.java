package ALgos;

public class merge {
     listNode Head1;
      listNode Head2;
     public static class listNode{
        int data;
        listNode next;
       public listNode(int data){
           this.data = data;
           this.next = null;
       }
    }

    public static void main(String[] args) {
        listNode Head1 = new listNode(1);
        listNode second = new listNode(2);
        listNode third = new listNode(4);
        listNode forth = new listNode(6);
        Head1.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;

        listNode Head2 = new listNode(3);
        listNode second1 = new listNode(5);
        listNode third1 = new listNode(7);
        Head2.next = second1;
        second1.next = third1;
        third1.next = null;

        listNode newlist;
       newlist = merge1(Head1,Head2);
       while (newlist!=null){
           System.out.print(newlist.data+" ");
           newlist = newlist.next;
       }
    }
    public static listNode merge1(listNode Head1,listNode Head2){
        listNode temp_node = new listNode(0);
        listNode current_node = temp_node;
        while (Head1!=null&&Head2!=null){
            if(Head1.data<Head2.data){
                current_node.next = Head1;
                Head1 = Head1.next;
            }else {
                current_node.next = Head2;
                Head2 = Head2.next;
            }
            current_node = current_node.next;
        }
        if (Head1==null){
            while (Head2!=null){
                current_node.next = Head2;
                Head2 = Head2.next;
                current_node = current_node.next;
            }
        }
        if(Head2==null){
            while (Head1!=null){
                current_node.next = Head1;
                Head1 = Head1.next;
                current_node = current_node.next;
            }
        }
return temp_node.next;
    }
}
