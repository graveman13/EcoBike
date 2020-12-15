package util;

public class ParseEcoBikeFormatUtil {
    private final static String SEPARATOR = " |\\;";

    private ParseEcoBikeFormatUtil() {
    }

    public static String[] parse(String inputLine) {
        return inputLine.split(SEPARATOR);

    }
}
