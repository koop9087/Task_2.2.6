public class Calculate {

    public static void theMatrix(int[][] array) {
        createTheTopMatrix(array, 1);
        createTheBotMatrix(array, 1);
    }

    private static void createTheTopMatrix(int[][] array, int value) {
        int numOfTopMatrix = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = numOfTopMatrix; j < array.length - numOfTopMatrix; j++) {
                array[i][j] = value;
            }
            numOfTopMatrix++;
        }
    }

    private static void createTheBotMatrix(int[][] array, int value) {
        int numOfBottomMatrix = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = numOfBottomMatrix; j < array.length - numOfBottomMatrix; j++) {
                array[i][j] = value;
            }
            numOfBottomMatrix++;
        }
    }
}
