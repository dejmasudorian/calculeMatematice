package org.fastrackit;

public class Fractie {
    int mathfract (int a, int b) {
        int cat = a / b;
        int rest = a % b;
        System.out.println("Rezutatul fractiei dintre " + a + " si " + b + " este compus din " + cat + " si restul " + rest);
        return cat;
    }
}
