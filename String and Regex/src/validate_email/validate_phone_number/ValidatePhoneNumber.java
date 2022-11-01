package validate_email.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$");

        String[] strings = {"(84)-(0978489648)", "(a8)-(22222222)","(1)(1234567890)","((84))-(0123456789)"};
        for (String string : strings) {
            System.out.println(string + " is " + pattern.matcher(string).matches());
        }
    }

}
