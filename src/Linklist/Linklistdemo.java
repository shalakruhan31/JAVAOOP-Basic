package Linklist;
import java.util.*;

public class Linklistdemo {// Java Program to Demonstrate
// Implementation of LinkedList
// class

// Importing required classes
//import java.util.*;

    // Main class


        // Driver code
        public static void main(String args[])
        {
            // Creating object of the
            // class linked list
            LinkedList<String> ll = new LinkedList<String>();

            // Adding elements to the linked list
            ll.add("A");
            ll.add("B");
            ll.addLast("C");
            ll.addFirst("D");
            ll.add(2, "E");

            System.out.println(ll);

            ll.remove("B");
            ll.remove(3);
            ll.removeFirst();
            ll.removeLast();

            System.out.println(ll);
        }
    }


