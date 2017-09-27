public class CenturyFromYear {

    public static int centuryFromYear(int year) {
        String stringYearRepresentation = String.valueOf(year);
        int yearLength = stringYearRepresentation.length();
        int substringLength = 0;

        if (yearLength == 4) substringLength = 2;
        if (yearLength == 3) substringLength = 1;
        if (yearLength <= 2) return 1;

        int centuryDigits = Integer.parseInt(stringYearRepresentation.substring(0, substringLength));
        int lastYearNumber = Integer.parseInt(stringYearRepresentation.substring(yearLength - 1));

        if (lastYearNumber != 0) {
            return centuryDigits + 1;
        } else return centuryDigits;
    }
}
