import java.sql.SQLOutput;
import java.util.*;
public class Exercises {
    public static void main(String[] args) {
        //Exercise 1
        int[] numbers = new int[8];

        //Exercise 2a
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;

        //Exercise 2b
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        int d = numbers[3];
        int e = numbers[4];
        int f = numbers[5];
        int g = numbers[6];
        int h = numbers[7];
        //Exercise 2c
        int[] newnumbers = {1, 2, 3, 4, 5};

        //Exercise 2d
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < newnumbers.length; i++){
            System.out.println("Give me index " + i);
            newnumbers[i] = input.nextInt();
        }

        //Exercise 2e
        int[] newernumbers = {-4, 19, 3, 20, 72, 58};

        //Exercise 3a
        System.out.println(newnumbers[newnumbers.length - 1]);

        //Exercise 3b
        System.out.println(newnumbers[newnumbers.length/2]);

        //Exercise 3c
        for(int i = 0; i < newnumbers.length; i++){
            System.out.println(newnumbers[i] - 1);
        }
        //Exercise 3d
        int [] even = {500};
        for(int i = 0; i < even.length; i++){
            even[i] = i *2;
        }

        //Exercise 3f
        System.out.println(even[100]);


        //Exercise 3g
        System.out.println(even[278]);
        System.out.println(even[456]);



        //Exercise 3h
        int[] odd = new int [Math.abs(Math.abs(-4) - Math.abs(5))];
        for(int i = 0; i < odd.length; i++){
            odd [i] = i / 2;
            }
        }
        //Exercise 3i
        int x = -4;
        int y = 5;
        int[] odd = new int [Math.abs(Math.abs(x) - Math.abs(y))];
            for(int i = 0; i < odd.length; i++)
            odd [i] = i / 2;
    }
}




