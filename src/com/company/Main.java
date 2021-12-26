package com.company;
import java.util.*;
public class Main {

    public static void main(String args[]) {
        LinkedList <String> l_list= new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("LinkedList before the shuffling:\n"+l_list);
        Collections.shuffle(l_list);
        System.out.println("Limked list after suffleing:\n"+l_list);




	// write your code here
    }
}
