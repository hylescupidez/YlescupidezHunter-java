import java.util.Arrays;
public class ExerciseSix {
    public static void main(String[] args) {
        //Exercise 1
        double[] firstArray = new double[1028];


        //Exercise 2
        int[][] multiArray = new int[5][4];


        //Exercise 3
        String[][] studentSeating = new String[6][4];


        //Exercise 4
        /*
           0   1   2   3
        0 ""  ""  ""  ""
        1 ""  ""  ""  ""
        2 ""  ""  ""  ""
        3 ""  ""  ""  ""
        4 ""  ""  ""  ""
        5 ""  ""  ""  ""
        */


        //Exercise 5
        studentSeating[0][0] = "Yimo";
        studentSeating[0][1] = "Drew";
        studentSeating[0][2] = "Daniel";
        studentSeating[0][3] = "Hunter";
        studentSeating[1][0] = "Nick";
        studentSeating[1][1] = "Jackson";
        studentSeating[1][2] = " ";
        studentSeating[1][3] = "Grace";
        studentSeating[2][0] = "Kele";
        studentSeating[2][1] = "Frank";
        studentSeating[2][2] = "Eric";
        studentSeating[2][3] = "Billy";
        studentSeating[3][0] = "Nick";
        studentSeating[3][1] = "Matthew V.";
        studentSeating[3][2] = "Joey";
        studentSeating[3][3] = "Connor";
        studentSeating[4][0] = "Seante";
        studentSeating[4][1] = "Gabe";
        studentSeating[4][2] = "Gavin";
        studentSeating[4][3] = "Jade";
        studentSeating[5][0] = "Matthew T.";
        studentSeating[5][1] = "Issac";
        studentSeating[5][2] = "Bob";
        studentSeating[5][3] = "Joe";

        //Exercise 6
        System.out.println(studentSeating[1][2]);


        //Exercise 7
        studentSeating[2][1] = "The teacher's seat";


        //Exercise 8
        String change= studentSeating[3][2];
        studentSeating[3][2] = studentSeating[1][2];
        studentSeating[1][2] =change;


        //Exercise 9
        int[][] pernil = new int[10][2];


        //Exercise 10
        String[][] chess = new String[8][8];
        Arrays.fill(chess[1], 0, 8, "pawn");
        Arrays.fill(chess[6], 0, 8, "pawn");


        //Exercise 11
        int[][] data = new int[4][7];
        for(int i = 2; i < 3; i++){
            for(int j = 0; j < data[i].length; j++){
                data[i][j] = j;
            }
        }


        //Exercise 12
        int[][] matrix = new int[6][8];
        int[] first = new int[matrix[0].length];
        int[] second = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                if (j == 1) {
                    first[i] = matrix[i][j];

                }
                if(j == 4){
                    second[i] = matrix[i][j];
                    matrix[i][j] = first[i];
                    matrix[i][1] =second[i];
                }
            }
        }


        //Exercise 13
        int[][] numbers = {{3, 4, 5, 6}, {4, 5, 6, 7}, {5, 6, 7, 8}};
        mystery(numbers);

        //Exercise 14
        /*
        0   1   2   3   4   5   6   7   8   9
        1   1   2   3   4   5   6   7   8   9
        2   2   4   6   8  10 12 14 16 18
        3   3   6   9  12 15 18 21 24 27
        4   4   8  12 16 20 24 28 32 36
        5   5  10 15 20 25 30 35 40 45
        6   6  12 18 24 30 36 42 48 54
        7   7  14 21 28 35 42 49 56 63
        8   8  16 24 32 40 48 56 64 72
        9   9  18 27 36 45 54 63 72 81
       10 10 20 30 40 50 60 70 80 90
       11  11 22 33 44 55 66 77 88 99
        */
        int[][] multiply = new int[10][12];
        //controls which array is inside the 2 dimension array
        for(int i = 0; i < multiply.length; i++){
            //controls which element is inside of the array
            for(int j = 0; j < multiply[i].length; j++){
                //assigns specific element to a numerical value through i and j
                multiply[i][j] = (i + 1)*(j + 1);
            }
        }


        //Exercise 15
        int[] tmps = new int[matrix[0].length];
        int[] tmps2 = new int[matrix[0].length];
        for(int i = 0; i < multiply.length; i++){
            for(int j = 0; j < multiply[i].length; j++){
                if(j == 2){
                    tmps[i] = multiply[i][j];
                }
                if(j == 6){
                    tmps2[i] = multiply[i][j];
                    multiply[i][j] = tmps[i];
                    multiply[i][2] = tmps2[i];
                }
            }
        }
    }
    public static void mystery(int[] [] a){
        int len = a[0].length - 1;
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < len; c++){
                if (a[r][c + 1] > a[r][c]){
                    a[r][c] =a[r][c+1];
                }
            }
        }
    }
}

