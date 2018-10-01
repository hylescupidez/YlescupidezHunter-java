/*
********************************
* Hunter Ylescupidez
* AP CS A
* Period 1
* September 10, 2018
* Project #1 - SixDays of Xmas
********************************
 */
public class sixDays {
    public static void main(String[] args){
        firstVerse();
        System.out.println();
        secondVerse();
        System.out.println();
        thirdVerse();
        System.out.println();
        fourthVerse();
        System.out.println();
        fifthVerse();
        System.out.println();
        sixthVerse();
    }
    /*here is the first verse */
    public static void firstVerse(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        firstGift();
    }
    /*here is the first gift of a pear tree*/
    public static void firstGift(){
        System.out.println("a patridge in a pear tree.");

    }
    /*here is the second verse */
    public static void secondVerse(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        secondGift();
    }
    /*here is the second gift of doves*/
    public static void secondGift(){
        System.out.println("two turtle doves, and");
        firstGift();
    }
    public static void thirdVerse(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        thirdGift();

    }
    /* here is the third gift of french hens */
    public static void thirdGift(){
        System.out.println("three French Hens,");
        secondGift();
    }
    /*here is the fourth verse */
    public static void fourthVerse(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        fourthGift();
    }
    /*here is the fourth gift of calling birds */
    public static void fourthGift(){
        System.out.println("four calling birds,");
        thirdGift();
    }
    /*here is the fifth verse */
    public static void fifthVerse(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        fifthGift();
    }
    /*here is the fifth gift of golden rings */
    public static void fifthGift(){
        System.out.println("five golden rings,");
        fourthGift();
    }
    /*here is the sixth verse */
    public static void sixthVerse(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        sixthGift();
    }
    /*here is the sixth gift of geese */
    public static void sixthGift(){
        System.out.println("six geese a-laying,");
        fifthGift();
    }
}
