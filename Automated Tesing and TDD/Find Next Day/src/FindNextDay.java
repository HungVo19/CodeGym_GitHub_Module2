public class FindNextDay {

    public static String findNextDay(int date, int month, int year) {

        boolean monthOf30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean monthOf31daysExceptDec = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean date29FebOfLeapYear = month == 2 && date == 29 && checkLeapYear(year);
        boolean date28FebOfNotLeapYear = month == 2 && date == 28 && !checkLeapYear(year);
        if (date < 1 || (date > 30 && monthOf30days) || (date > 31 && monthOf31daysExceptDec) || month < 1 || month > 12) {
            return "Not available!!";
        } else {

            if (date == 30 && monthOf30days || date ==31 && monthOf31daysExceptDec || date29FebOfLeapYear || date28FebOfNotLeapYear) {
                return "1/" + (month + 1) + "/" + year;
            } else if (date == 31 && month == 12) {
                return "1/1" + "/" + (year + 1);
            } else if (month == 2 && date == 29 && !checkLeapYear(year)) {
                return "Not available!!";
            }
            return (date + 1) + "/" + month + "/" + year;
        }
    }


    private static boolean checkLeapYear(int year) {
        boolean isDivisionByFour = (year % 4 == 0);
        boolean isDivisionByOneHundred = (year % 100 == 0);
        boolean isDivisionByFourHundred = (year % 400 == 0);
        if (isDivisionByFour) {
            if (isDivisionByOneHundred) {
                return isDivisionByFourHundred;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}