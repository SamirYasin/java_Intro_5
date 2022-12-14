package homeworks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {

    //Task 1
/*
    public static int countConsonants(String str) {
        str = str.replaceAll("[^A-Za-z]", "");
        str = str.replaceAll("[AEIOUaeiou]", "");

        return str.length();
    }

    //Task 2
    public static String wordArray(String str) {
        str = removeExtraSpaces(str);
        str = str.replaceAll("[^A-Za-z ]", "");
        return Arrays.toString(str.split(" "));
    }

    //Task 3
    public static String removeExtraSpaces(String str) {
        str = str.replaceAll("[\\s]{1,}", " ");
        return str;
    }


    //Task 4
    public static int count3OrLess() {
        String str = ScannerHelper.getAString();
        int counter = 0;

        str = " " + str + " ";

        str = str.replaceAll("[^A-Za-z ]", " ");

        Pattern pattern = Pattern.compile(" [A-Za-z]{1,3} ");
        Matcher match = pattern.matcher(str);

        while (match.find()) {
            counter++;
        }
        return counter;
    }
    //Task 5
    public static boolean isDateFormatValid(String str){
        Pattern pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    //Task 6
    public static boolean isEmailFormatValid(String str){
        Pattern pattern = Pattern.compile("[\\w.]{2,}@[\\w.[^_]]{2,}\\.[\\w[^_]]{2,}");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

 */
}
