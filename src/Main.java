public class Main {
    public static void main(String[] args) {
        int valueElementOfMatrix = 1;
        int size = CustomScanner.scanInt();
        int[][] array = new int[size][size];
        Calculate.theMatrix(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}
