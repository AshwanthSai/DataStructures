package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        var myarray = new customArray(5);
        myarray.insert(99);
        myarray.insert(20);
        myarray.insert(30);
        System.out.println(myarray.indexOf(20));
    }
}
