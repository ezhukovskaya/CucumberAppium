package framework.utils;

public class StringUtils {
    private static final String NON_DIGITS_REG_EX = "\\D+";

    public static Double toDouble(String str){
        return Double.parseDouble(str.replaceAll(NON_DIGITS_REG_EX,""));
    }
}
