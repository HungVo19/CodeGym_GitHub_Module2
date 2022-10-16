public class FindNextDay {

    public static String findNextDay(int date, int month, int year) {

        boolean monthOf30days = date == 30 && (month == 4 || month == 6 || month == 9 || month == 11);
        boolean monthOf31daysExceptDec = date == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10);

        if (checkLeapYear(year)){
            if (month == 2 && date == 29){
                return "1/" + (month + 1) + "/" + year;
            }
        } else {
            return "Not available!!";
        }

        if (monthOf30days || monthOf31daysExceptDec) {
            return "1/" + (month + 1) + "/" + year;
        } else if (date == 31 && month == 12) {
            return "1/1" + "/" + (year + 1);
        }
        return (date + 1) + "/" + month + "/" + year;
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