package com.devix.www;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("socrates");
        list.add("plato");
        list.add("cebes");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);

        boolean a = hashSet.contains("cebes");
        System.out.println(a);

        boolean b = hashSet.containsAll(list);
        System.out.println(b);
    }
}
