package com.kira.node;

public class Node {
    public int value;
    public Node next;
    public Node(int data) {
        this.value = data;
    }

    public Node() {
    }

    public Node(int[] data) {
        if (data.length > 0){
            this.value = data[0];
            if (data.length > 1) {
                set(this,data,1);
            }
        }
    }

    private void set(Node node,int[] data, int index) {
        node.next = new Node(data[index]);
        if (index < data.length-1) {
            index++;
            set(node.next,data,index);
        }
    }
}
