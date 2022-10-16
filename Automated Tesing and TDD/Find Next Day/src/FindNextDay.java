public class FindNextDay {

    public static String findNextDay(int day, int month, int year) {
            switch (day) {
                case 28:
                    if (month == 2) {
                        if(checkLeapYear(year)){
                            return (day + 1) + "/" + month + "/" + year;
                        } else {
                            return 1 + "/" + (month + 1) + "/" + year;
                        }
                    }
                case 29:
                    if ( checkLeapYear(year) && month == 2){
                        return 1 + "/" + (month + 1) + "/" + year;
                    }else if (month == 2){
                        System.out.println("Not available!!");
                    } else {
                        return (day + 1) + "/" + month + "/" + year;
                    }
                case 30:
                    switch (month) {
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            return 1 + "/" + (month + 1) + "/" + year;
                    }
                case 31:
                    if (month == 12){
                        return "1/1/" + (year+1);
                    }
                    return 1 + "/" + (month + 1) + "/" + year;
                default:
                    return (day + 1) + "/" + month + "/" + year;
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

    public static void main(String[] args) {
        System.out.println(FindNextDay.checkLeapYear(2018));
    }
}