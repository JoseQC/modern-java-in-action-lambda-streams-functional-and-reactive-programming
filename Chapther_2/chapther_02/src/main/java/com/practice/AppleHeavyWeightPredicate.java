package com.practice;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple a) {
        return a.weight>150;
    }
}
