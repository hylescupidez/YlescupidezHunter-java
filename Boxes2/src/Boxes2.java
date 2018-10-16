public class Boxes2 {
    public static void main(String[] args) {
        drawStuff(1, 1, '*');
        drawStuff(2, 2, '#');
        drawStuff(3, 3, '$');
    }

    public static void drawStuff(int col, int row, char symbol) {
        for (int j = 0; j <= row; j++) {
            for (int i = 0; i <= col; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}


