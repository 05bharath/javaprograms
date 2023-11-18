import java.util.*;
class ListNode {  
    int val;  
    ListNode next;  
    public ListNode(int val) {  
        this.val = val;  
    }  
}
class delSolution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode current =head;
        int count=0;
        if(head==null)
             return null;
              while(current!=null)
        {
            current=current.next;
            count++;
        }
         if (count == n) {
        return head.next;
    }

        current=head;
        for(int i=0;i<count-1-n;i++)
        {
            current=current.next;
        }
       
        if(current!=null)
        {
            current.next=current.next.next;
        }
   
return head; 
    }
}
public class removenthnode
{
public static void main(String arr[])
{


   ListNode node1 = new ListNode(1);  
   ListNode node2 = new ListNode(2);  
   ListNode node3 = new ListNode(3);  
   ListNode node4 = new ListNode(4);  
   ListNode node5 = new ListNode(5);  
        node1.next = node2;  
        node2.next = node3;  
        node3.next = node4; 
		node4.next = node5; 

 delSolution del =new delSolution();
 ListNode current = del.removeNthFromEnd(node1,2);  
        while (current != null) {  
            System.out.println(current.val);  
            current = current.next;  
        }  




}
}