package LinkedList;

import Arrays.Array;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
         var mylist = new LinkedList(null,null);
         mylist.addLast(10);
         mylist.addLast(20);
         mylist.addLast(30);
         System.out.println(mylist.indexOf(30));
    }
}
