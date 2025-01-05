public class LL3 {
    int data;
    LL3 next;
    
    LL3(int data) {
        this.data = data;
        this.next = null;
    }
    
    public static void print(LL3 head) {
        LL3 current = head;
        while (current != null) {
            System.out.print("->" + current.data);
            current = current.next;
        }
        System.out.println();
    }
    
    public static boolean hasCycle(LL3 head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        LL3 fast = head;
        LL3 slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        LL3 node1 = new LL3(1);
        LL3 node2 = new LL3(2);
        LL3 node3 = new LL3(3);
        LL3 node4 = new LL3(4);
        LL3 node5 = new LL3(5);
        LL3 node6 = new LL3(6);
        LL3 node7 = new LL3(7);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node3; // No cycle
        
        System.out.println("Has cycle: " + hasCycle(node1));
        
        // Create a cycle for testing
        node7.next = node3;
        System.out.println("Has cycle after creating one: " + hasCycle(node1));
        // print(node1);
    }
}