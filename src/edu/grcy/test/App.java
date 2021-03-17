package edu.grcy.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        final List<Integer> list=new ArrayList<>();
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(7);
        Collections.sort(list);
        list.add(3);
        list.add(1);
        System.out.print(list.get(0));
        System.out.print(list.get(3));
        System.out.print(list.get(5));

        Optional<Integer>min = list.stream().min(Integer::compareTo);
        if (min.isPresent()){
            System.out.println(min.get());
        }else {
            System.out.println("x");
        }
    }
}
