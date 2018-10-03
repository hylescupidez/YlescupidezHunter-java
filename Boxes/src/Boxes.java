public class Boxes {
    public static final int WIDTH = 5;
    public static final int LENGTH = 5;

    public static void main(String[] args) {
        printAsterisk();
        System.out.println();
        printDollar();
        System.out.println();
        printHashtag();
    }

    public static void printAsterisk() {
        for (int j = 0; j < WIDTH; j++) {
            for (int i = 0; i < LENGTH; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void printDollar() {
            for (int j = 0; j < WIDTH; j++){
                for (int i = 0; i < LENGTH; i++){
                    System.out.print("$");
                }
                System.out.println();
            }

        }
        public static void printHashtag() {
            for (int j = 0; j < WIDTH; j++) {
                for (int i = 0; i < LENGTH; i++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }


