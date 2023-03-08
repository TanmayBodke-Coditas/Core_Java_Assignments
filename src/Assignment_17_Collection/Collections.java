package Assignment_17_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //Question1
        System.out.println("Contains or not ==>");
        System.out.println(set.contains(3));

        //Question2
        Iterator<Integer> iterator = set.iterator();
        int first_element = iterator.next();
        int last = 0;
        while(iterator.hasNext()){
            int element  = iterator.next();
            if(!iterator.hasNext()){
                last = element;
            }
        }
        System.out.println("First and Last element of HashSet ==>");
        System.out.println("First Element :: " + first_element);
        System.out.println("Last Element :: " + last);


        //Qustion3
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        Set<Integer> newSet = new HashSet<>(treeSet);
        System.out.println("Conversion of TreeSet to HashSet ==>");
        for (int a: newSet) {
            System.out.println(a);
        }

        //Question4
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);

        Set<Integer> newSet1 = new TreeSet<>(hashSet);
        System.out.println("Conversion of HashSet to TreeSet ==>");
        for (int a: newSet1) {
            System.out.println(a);
        }

        //Question5

        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(9);

        int[] array = hashSet1.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Conversion of HashSet to Array ==>");
        for (int a : array) {
            System.out.println(a);
        }




    }
}

/*
Contains or not ==>
true
First and Last element of HashSet ==>
First Element :: 1
Last Element :: 4
Conversion of TreeSet to HashSet ==>
1
2
3
Conversion of HashSet to TreeSet ==>
4
5
6
Conversion of HashSet to Array ==>
7
8
9

 */