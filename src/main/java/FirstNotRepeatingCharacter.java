import java.util.HashSet;

public class FirstNotRepeatingCharacter {

    public static char firstNotRepeatingCharacter(String inputString) {
        HashSet<Character> allDuplicates = findAllDuplicates(inputString);
        for (char duplicatedCharacter : allDuplicates
                ) {
            inputString = removeDuplicatedCharacter(inputString, duplicatedCharacter);
        }

        if (!inputString.isEmpty()) return inputString.charAt(0);
        else return '-';
    }

    private static HashSet<Character> findAllDuplicates(String inputText) {
        char[] charArray = inputText.toCharArray();
        HashSet<Character> possibleDuplicates = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < charArray.length; i++) {
            if (possibleDuplicates.contains(charArray[i])) duplicates.add(charArray[i]);
            else possibleDuplicates.add(charArray[i]);
        }

        return duplicates;
    }

    private static String removeDuplicatedCharacter(String inputString, char duplicatedCharacter) {
        return inputString.replace(duplicatedCharacter, ' ').trim();
    }
}
