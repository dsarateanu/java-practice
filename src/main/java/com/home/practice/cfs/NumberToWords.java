package com.home.practice.cfs;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(10);
    }

    public static void numberToWords(int number) {

        int reverseNumber = reverse(number);
        int countDigit = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int count = 0;

            while (reverseNumber > 0) {
                int digit = reverseNumber % 10;
                reverseNumber /= 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;

                    case 1:
                        System.out.println("One");
                        break;

                    case 2:
                        System.out.println("Two");
                        break;

                    case 3:
                        System.out.println("Three");
                        break;

                    case 4:
                        System.out.println("Four");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;

                    case 6:
                        System.out.println("Six");
                        break;

                    case 7:
                        System.out.println("Seven");
                        break;

                    case 8:
                        System.out.println("Eight");
                        break;

                    case 9:
                        System.out.println("Nine");
                        break;
                }
                count++;
            }

            if (countDigit > count) {
                for (int i = 0; i < countDigit - count; i++) {
                    System.out.println("Zero");
                }
            }
        }

    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
