package com.winterbe.java8.samples.lambda;

/**
 * @author Benjamin Winterberg
 */
public class Lambda4 {

    static int outerStaticNum;

    int outerNum;

    void testScopes() {
        int num = 1;

        Lambda2.Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        String convert = stringConverter.convert(2);
        System.out.println(convert);    // 3

        Lambda2.Converter<Integer, String> stringConverter2 = (from) -> {
            outerNum = 13;
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        System.out.println(stringConverter2.convert(2));
        System.out.println(outerStaticNum);
        System.out.println(outerNum);
        String[] array = new String[1];
        Lambda2.Converter<Integer, String> stringConverter3 = (from) -> {
            array[0] = "Hi there";
            return String.valueOf(from);
        };

        stringConverter3.convert(23);

        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        new Lambda4().testScopes();
    }

}