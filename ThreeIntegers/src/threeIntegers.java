public class threeIntegers {
    public static void main(String args[]){
        double plus = addition(3,4);
        System.out.println(plus);
       double test = smallest(1 , 2, 4);
       System.out.println(test);
       double squareroot = maxAndMin(4, 5, 6);
       System.out.println(squareroot);
    }
    public static double addition(int x, int y) {
        return x +y;

    }
    public static double smallest(int a, int b, int c){
        double small = Math.min((Math.min(a,b)), c);
        return small;
    }
    public static double maxAndMin(int d, int e, int f){
        int smaller = Math.min((Math.min(d, e)),f);
        int bigger = Math.min((Math.max(d, e)), f);
        double square = Math.sqrt(smaller + bigger);
            return square;
    }
}
