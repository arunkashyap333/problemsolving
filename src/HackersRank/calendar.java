package HackersRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 
class Result {
    

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

//    public static String findDay(int month, int day, int year) {
//    	Calendar c = Calendar.getInstance();
//    	c.setTimeZone(20210630);
//    	int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//    	return null;
//    }

}

public class calendar {
    public static void main(String[] args) throws IOException, ParseException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//        int month = 6;
//
//        int day = 30;
//
//        int year = 2021;
//
//        String res = Result.findDay(month, day, year);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    	
    	String month = "07";
        String day = "01";
        String year = "2021";
        String inputDateStr = String.format("%s/%s/%s", day, month, year);
        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);
    }
}

