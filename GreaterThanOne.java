package GreaterThanOne;

import java.util.ArrayList;

public class GreaterThanOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(3);
        numbs.add(5);
        numbs.stream().filter(a-> a>1).forEach(System.out::println);
    }
}
