package com.kira.node;

public class NodeTest {

    public static void main(String[] args) {
        Node node = new Node(new int[]{2,4,3});
        Node node2 = new Node(new int[]{5,6,4});
        //Node result = ReverseNode.reverse(node);
        Node result = TwoSum.addTwoNumbers(node,node2);
        System.out.println(result.value);
        while (result.next != null) {
            System.out.println(result.next.value);
            result = result.next;
        }
    }
}
