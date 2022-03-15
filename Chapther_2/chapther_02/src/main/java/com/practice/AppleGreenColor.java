package com.practice;

class AppleGreenColorPredicate implements ApplePredicate{

    public boolean test(Apple a) {

        return "GREEN".equals(a.getColor());
    }
}
