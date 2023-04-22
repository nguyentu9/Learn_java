package com.example.LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;

    private int numOfItems;

    @Override
    public void insert(T data) {
        if (root == null) {
            // this is the first item in the linked list
            root = new Node<>(data);
        } else {
            // we know that this is not the first item in the linked list

            insertBeginning(data);
//            insertEnd(data, root);
        }
    }

    // we just have to update the references O(1)
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    // because we have to start with the root node
    // first we have to find the last node in O(N)
    private void insertEnd(T data, Node<T> node) {

        // this is when we keep looking for the last node O(N)
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            // we have found the last node
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (root == null) return;

        // we want to remove the first node (root)
        if (root.getData().compareTo(data) == 0) {
            root = root.getNextNode();
        } else {
            remote(data, root, root.getNextNode());
        }
    }

    private void remote(T data, Node<T> previousNode, Node<T> actualNode) {

        // we have to find the node we want to remove
        while (actualNode != null) {
            // this is the node we want to remove
            if (actualNode.getData().compareTo(data) == 0) {
                // update the references
                numOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverse() {
        if (root == null) return;

        Node<T> actualNode = root;

        while (actualNode != null) {
            System.out.print(actualNode);
            actualNode = actualNode.getNextNode();
        }

        System.out.print("null");
    }

    @Override
    public int size() {
        return 0;
    }
}
