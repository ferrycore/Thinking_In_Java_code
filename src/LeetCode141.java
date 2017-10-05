import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode141 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val =x;
            next =null;
        }
    }
    public boolean hasCycle(ListNode head){
        Set<ListNode>nodeSeen =new HashSet<>();

        while (head!=null){
            if(nodeSeen.contains(head)){
                return true;
            }
            else{
                nodeSeen.add(head);
            }
            head =head.next;
        }
        return false;
    }


}
