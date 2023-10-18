public class NextDayCalculator {
    public static int getDaysofMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                boolean isLeapYear = isLeapYear(year);
                if(isLeapYear){
                    return 29;
                }
                else {
                    return 28;
                }
            default:
                return 0;
        }
    }
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] nextDay(int day,int month,int year){
        int [] result = new int[]{day,month,year};
        if(day > 31 || day < 1){
            throw new RuntimeException();
        } else if (day == getDaysofMonth(month,year)) {
            result[0] = 1;
            if (month < 12){
                result[1] = month + 1;
            }
            else {
                result[1] = 1;
                result[2] = year + 1;
            }
        }
        else {
            result[0] = day + 1;
        }
        return result;
    }
}