public class RotateImage {

    static int[][] rotateImage(int[][] a) {
        int maxLength = a.length;

        int[][] rotatedImage = new int[maxLength][maxLength];

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < maxLength; j++) {
                rotatedImage[i][j] = a[(maxLength - 1) - j][i];
            }
        }

        return rotatedImage;
    }

}
