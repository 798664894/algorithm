package com.kira.node;

public class ReverseNode {

    public static Node reverse(Node node) {
        Node pre = null;
        Node next = null;

        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
