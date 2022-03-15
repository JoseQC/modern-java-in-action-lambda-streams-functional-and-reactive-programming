package com.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple("GREEN",124.56));
        inventory.add(new Apple("RED",180.0));
        inventory.add(new Apple("BLUE",180.0));

        filterApples(inventory, new AppleGreenColorPredicate()).forEach(System.out::println);
        System.out.println("============================================================");
        filterApples(inventory, new AppleHeavyWeightPredicate()).forEach(System.out::println);
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){

        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory){
            if(p.test(apple))
                result.add(apple);
        }
        return  result;
    }
}


