import java.util.*;
public class Exercises2 {
    public static void main(String[] args) {
        //Exercise 1a
        System.out.println("14, 6, 2200, 98");

        //Exercise 1b
        System.out.println("11, 4, 99, 2, 44, 0, 0, 0");

        //Exercise 1c
        System.out.println("3, 3, 0, 0, 6, 9, 0, -18");
    }

    //Exercise 1d
    public static int max(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    //Exercise 1e
    public static double average(int[] a) {
        int b = 0;
        for (int i : a) {
            b += i;
        }
        return (b / a.length);
    }


    //Exercise 2a
    public static int[] exercise2(int[] numbers) {
        int[] a = new int[2 * numbers.length];


        //Exercise 2b
        for (int i = 0; i < a.length; i++) {
            if (i < 4) {
                Arrays.fill(a, i, i + 1, a[i]);
                //Exercise 2c
            } else {
                Arrays.fill(a, i, i + 1, 42);
            }
        }
        return a;
    }


    //Exercise 3
    public static int range(int[] array) {
        int min = array[0];
        int max = array[array.length - 1];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return (max - min) / 2;
    }

    //Exercise 4
    public static int mode(int[] a) {
        Arrays.sort(a);
        return commonElement(a);
    }

    public static int commonElement(int[] a) {
        int max = maxIndex(a);
        int[] b = new int[a[max] + 1];
        for (int anA : a) {
            ++b[anA];
        }
        return maxIndex(b);
    }

    public static int maxIndex(int[] a) {
        int maxElementIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[maxElementIndex]) {
                maxElementIndex = i;
            }
        }

            return maxElementIndex;
        }
    }



