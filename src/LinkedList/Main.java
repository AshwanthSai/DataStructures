package LinkedList;

import Arrays.Array;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
         var mylist = new LinkedList(null,null);
         mylist.addFirst(10);
         mylist.addFirst(20);
         mylist.addFirst(30);
         mylist.print();
    }
}
