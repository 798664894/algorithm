package com.kira.node;

public class TwoSum {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node result = new Node(0);
        Node next = result;
        int over = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.value + l2.value + over;
            over = sum/10;
            next.next = new Node(sum % 10);
            next = next.next;
            if(l1.next == null && l2.next != null) {
                l1 =  new Node(0);
                l2 = l2.next;
            }else if(l1.next != null && l2.next == null) {
                l2 =  new Node(0);
                l1 = l1.next;
            }else {
                l2 = l2.next;
                l1 = l1.next;
            }
        }
        if(over > 0) {
            next = new Node(over);
        }
        return result;
    }
}
