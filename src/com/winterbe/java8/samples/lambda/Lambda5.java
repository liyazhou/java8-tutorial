package com.winterbe.java8.samples.lambda;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * Created by grijesh
 */
public class Lambda5 {

    //Pre-Defined Functional Interfaces
    public static void main(String... args) {

        //BiConsumer Example
        BiConsumer<String,Integer> printKeyAndValue
                = (key,value) -> System.out.println(key+"-"+value);

        printKeyAndValue.accept("One",1);
        printKeyAndValue.accept("Two",2);

        System.out.println("##################");

        BiConsumer<String, Integer> printKeyAndValue2 = (key, value) -> System.out.println(key + "-" + value);
        printKeyAndValue2.accept("lyz_one", 1);
        printKeyAndValue2.accept("lyz_two", 2);

        //Java Hash-Map foreach supports BiConsumer
        HashMap<String, Integer> dummyValues = new HashMap<>();
        dummyValues.put("One", 1);
        dummyValues.put("Two", 2);
        dummyValues.put("Three", 3);

        dummyValues.forEach((key,value) -> System.out.println(key+"-"+value));


        HashMap<String, Integer> dummyValues2 = new HashMap<>();
        dummyValues2.put("lyz_one", 1);

        dummyValues2.forEach((key, value) -> System.out.println(key + "_" + value));

    }
}
