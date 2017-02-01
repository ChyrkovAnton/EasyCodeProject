package project.Ext;

import project.Group;
import project.Mark;
import project.Student;

import java.util.Calendar;

public final class Misc {

    // Rounds float to specified precision
    public static double round (double floatNumber, int precision){

       return  (double)Math.round(floatNumber * intPow(10, precision)) /
                                                intPow(10, precision);

    }

    // Returns power of number
    public static int intPow (int number, int pow){
        int result = 1;
        for (int index = 0; index < pow; index ++){
            result *= number;
        }
        return result;
    }

    // Repeats given string N times
    public static String stringRepeat (String string, int times){
        return new String(new char[times]).replace("\0", string);
    }

    // Returns string containing date
    public static String calendarToString (Calendar calendar){
        String daySubstituteText = "";
        String monthSubstituteText = "";
        if (calendar.get(Calendar.DAY_OF_MONTH) < 10){
            daySubstituteText = "0";
        }
        if (calendar.get(Calendar.MONTH) < 10){
            monthSubstituteText = "0";
        }
        return daySubstituteText + calendar.get(Calendar.DAY_OF_MONTH) + "."
                + monthSubstituteText + calendar.get(Calendar.MONTH) + "."
                + calendar.get(Calendar.YEAR);
    }


}
