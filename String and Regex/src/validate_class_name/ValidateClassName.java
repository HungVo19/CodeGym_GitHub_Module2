package validate_class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIKLM]$");

        String[] strings = {"C0318G", "M0318G", "P0323A"};
        for (String string : strings) {
            System.out.println(string + " is " + pattern.matcher(string).matches());
        }
    }
}

