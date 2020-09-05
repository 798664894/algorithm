package com.kira.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HuffmanTree {
    static class Node<E>{
        E data;
        int weight;
        Node<E> leftChild;
        Node<E> rightChild;

        public Node(E data, int weight) {
            this.data = data;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static Node creatHuffmanTree(List<Node> nodes) {

        while (nodes.size() > 1) {
            //排序
            nodes.sort(Comparator.comparingInt(n -> n.weight));
            Node left = nodes.get(0);
            Node right = nodes.get(1);
            //合并权重最小的两个子树
            Node parent = new Node(null,left.weight + right.weight);
            parent.leftChild = left;
            parent.rightChild = right;
            nodes.remove(0);
            nodes.remove(0);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    public static void printNode(Node node) {
        System.out.println(node.toString());
        if (node.leftChild != null) {
            System.out.println("left:");
            printNode(node.leftChild);
        }
        if (node.rightChild != null) {
            System.out.println("right:");
            printNode(node.rightChild);
        }
    }

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node<>("a",10));
        nodes.add(new Node<>("b",15));
        nodes.add(new Node<>("c",12));
        nodes.add(new Node<>("d",3));
        nodes.add(new Node<>("e",4));
        nodes.add(new Node<>("f",13));
        nodes.add(new Node<>("g",1));
        Node node = creatHuffmanTree(nodes);
        printNode(node);
    }
}
