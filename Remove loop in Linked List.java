class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
         Node slow = head;
        Node fast = head;
        boolean loopExists = false;
    
    // Check if there is a loop
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            loopExists = true;
            break;
        }
    }
    
    // If there is a loop, find the start of the loop
    if (loopExists) {
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        // Move fast to the last node of the loop
        while (fast.next != slow) {
            fast = fast.next;
        }
        // Remove the loop
        fast.next = null;
        }
    }
    }
