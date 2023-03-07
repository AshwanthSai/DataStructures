package LinkedList;

import org.w3c.dom.Node;

import java.awt.image.SampleModel;
import java.util.Arrays;
import java.util.NoSuchElementException;

// Things to do
// Refactor Node class into Linked List, Nested Class - Why ? then you dont need setter and getter.
// Check state of Linked list before operating.
// Rewrite, addFist, add Last
// Rewrite indexOf
// Rewrite removeFirst
// Rewrite removeLast
// Rewrite size
// Convert Linked List to Arrays

public class LinkedList {

    public class MyNode {
        private int value;
        private MyNode nextNode;

        // We need to enforce atleast value for all nodes.
        public MyNode(int value) {
            this.value = value;
        }
    }

    private MyNode first;
    private MyNode last;

    private int size;

    public LinkedList(MyNode head, MyNode tail) {
        this.first = head;
        this.last = tail;
        this.size = 0;
    }

    // Check state of Linked list before operating.
    // Rewrite, addFist, add Last
    // Rewrite indexOf
    // Rewrite removeFirst
    // Rewrite removeLast
    // Rewrite size
    // Convert Linked List to Arrays


    //SSBA
    // Start with Sample
    // State of Data Structure
    // Break down function into smaller abstractions.

    public void addLast(int value) {
        var node = new MyNode(value);
        if(isEmpty()) {
            first = node;
            last = node;
        }
        // [10 -> 20 -> 30 -> 40]
        // [10 -> 20 -> 30 -> 40 -> x]
        last.nextNode = node;
        last = node;
    }

    public void addFirst(int value) {
        var node = new MyNode(value);
        // If Empty
        if(isEmpty()) {
            first = node;
            last = node;
        }
        // [10 -> 20 -> 30]
        // [x -> 10 -> 20 -> 30]
        var head = first;
        node.nextNode = head;
        first = node;
        System.out.println("Added value " + value);
    }

    public int indexOf(int value) {
        var node = new MyNode(value);
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.equals(node)) return index;
            current = current.nextNode;
            index++;
        }
        return -1;
    }

    // We abstracted the repeated logic here.


    public boolean isEmpty() {
        return (first == null);
    }

    public int[] toArray() {
        var myArr = new int[size];
        var current = first;
        int index = 0;

        while(current != null) {
            myArr[index++] = current.value;
            current = current.nextNode;
        }
        return myArr;
    }

    public void print(){
        var current = first;
        while(current != null){
            System.out.println(current.value);
            current = current.nextNode;
        }
    }
}
