/*
 ********************************
 * Hunter Ylescupidez
 * AP CS A
 * Period 1
 * October 12, 2018
 * Project #2 - Rocket
 ********************************
 */
public class CityCoordinates {
    public static void main(String[] args){
        //Tacoma and Gig Harbor
        System.out.println("Exercise 1");
        double distance = exercise(16,10,4, 28);
        System.out.println(distance);
        //Gig Harbor and Auburn
        System.out.println("Exercise 2");
        double newdistance = exercise(4, 28, 21, 21);
        System.out.println(distance + newdistance);
        //All 3 Cities
        System.out.println("Exercise 3");
        double newerdistance = exercise(21, 21, 16, 10);
        System.out.println(distance + newdistance + newerdistance);

    }
    //ditance formula
    public static double exercise(double x1, int y1, int x2, int y2){
        double first = Math.pow(x1 + x2, 2);
        double second = Math.pow(y1 + y2, 2);
        return Math.sqrt(first + second);

    }


    }

