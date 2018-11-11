package com.home.practice.vdo;

public class Variables {

    //Primitives
    //1 byte - integers between -128 and 127, default value = 0
    static byte byteValue = 10;
    //2 byte - integers between -32,768 and +32,767, default value = 0
    static short shortValue = 11;
    //4 byte - integers between -2,147,483,648 and +2,147,483,647, default value = 0
    static int intValue = 12;
    //8 byte - integers between -9,223,372,036,854,775,808 and +9,223,372,036,854,775,807, default value = 0
    static long longValue = 12L;
    //4 byte - Floating point number - 7 digits of accuracy, default value = 0.0f
    static float floatValue = 15.3F;
    //8 byte - Floating point number - 15 digits of accuracy, default value = 0.0d
    static double doubleValue = 17.6D;
    // default value - false
    static boolean booleanValue = true;
    static char charValue = 'c';

    //non-primitive
    //String - sequence of chars
    String stringValue = "Daniel Sarateanu";

    public static void main(String[] args) {

        // Playing with variables

        // ----- byte, short, int -----

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

        System.out.println();
        // ----------

        // ----- float, double -----

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue  = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);// 90.7185
        double pi = 3000000.1415927d;

        System.out.println();
        // ----------

        // ----- char, boolean -----

        // https://unicode-table.com/en/ - unicode characters
        char charValue = '\u00A9'; // 2bytes
        System.out.println("Unicode character: " + charValue);
        char charValueSimple = 'A';
        System.out.println("Simple character: " + charValueSimple);

        System.out.println("Boolean value: " + booleanValue);

        System.out.println();
        // ----------

        // ----- String -----

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);

        System.out.println();
        // ----------
    }

}
