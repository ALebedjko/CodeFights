import java.util.HashSet;

public class ValidSudoku {

    static StringBuilder stringBuilder = new StringBuilder();
    static int maxLength;

    static boolean sudoku2(char[][] grid) {
        maxLength = grid.length;
        return checkRows(grid) && checkColumns(grid) && checkEach3X3SubGrid(grid);
    }


    private static boolean checkRows(char[][] grid) {
        for (int i = 0; i < maxLength; i++) {
            stringBuilder.setLength(0);
            for (int j = 0; j < maxLength; j++) {
                char currentChar = grid[i][j];
                if (notHiddenCharacter(currentChar)) stringBuilder.append(currentChar);
                if (isHaveDuplicates(stringBuilder.toString())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkColumns(char[][] grid) {
        for (int j = 0; j < maxLength; j++) {
            stringBuilder.setLength(0);
            for (int i = 0; i < maxLength; i++) {
                char currentChar = grid[i][j];
                if (notHiddenCharacter(currentChar)) stringBuilder.append(currentChar);
                if (isHaveDuplicates(stringBuilder.toString())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkEach3X3SubGrid(char[][] grid) {
        for (int i = 0; i < maxLength; i += 3) {
            for (int j = 0; j < maxLength; j += 3) {
                stringBuilder.setLength(0);
                for (int x = i; x < 3 + i; x++) {
                    for (int y = j; y < 3 + j; y++) {
                        char currentChar = grid[x][y];
                        if (notHiddenCharacter(currentChar)) stringBuilder.append(currentChar);
                        if (isHaveDuplicates(stringBuilder.toString())) {
                            return false;

                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean notHiddenCharacter(char currentChar) {
        return currentChar != '.';
    }

    private static boolean isHaveDuplicates(String inputText) {
        char[] charArray = inputText.toCharArray();

        HashSet<Character> possibleDuplicates = new HashSet<>();

        for (int i = 0; i < charArray.length; i++) {
            if (possibleDuplicates.contains(charArray[i])) return true;
            else possibleDuplicates.add(charArray[i]);
        }

        return false;
    }


}
