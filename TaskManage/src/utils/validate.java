
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class validate {
    private static final Scanner SCANNER = new Scanner(System.in);
    private validate(){
        
    }
    public static int getInt(
            String messageInfo,
            String messsageErrorOutOfRange,
            String messageErrorNumber,
            int min,
            int max){
        do {            
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(SCANNER.nextLine());
                if(number>=min&&number<=max){
                    return number;
                }else{
                    System.out.println(messsageErrorOutOfRange);
                }
            } catch (NumberFormatException e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);
    }
    
    public static double getDouble(
            String messageInfo,
            String messsageErrorOutOfRange,
            String messageErrorNumber,
            double min,
            double max){
        do {            
            try {
                System.out.print(messageInfo);
                double number = Double.parseDouble(SCANNER.nextLine());
                if(number>=min&&number<=max){
                    return number;
                }else{
                    System.out.println(messsageErrorOutOfRange);
                }
            } catch (NumberFormatException e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);
    }
    
    public static String getString(String messageInfo, String messageError, final String REGEX){
        do {            
            System.out.print(messageInfo);
            String str = SCANNER.nextLine();
            if(str.matches(REGEX)){
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }
    
/**
 * Prompts the user to enter a date in a specified format, validates the input, 
 * and returns the valid date as a formatted string.
 *
 * @param messageInfo          The message prompting the user to enter a date.
 * @param messageErrorOutOfRange The error message displayed if the entered date is out of the allowed range.
 * @param messageErrorDate     The error message displayed if the entered date is in an incorrect format.
 * @param format               The date format, following {@link DateTimeFormatter} patterns.
 * @param min                  The minimum allowed date.
 * @param max                  The maximum allowed date.
 * @return A string representing the valid date formatted according to {@code format}.
 */
    public static String getDate(String messageInfo, String messageErrorOutOfRange,
                                    String messageErrorDate, String format,
                                    LocalDate min, LocalDate max) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(format);
        while (true) {
            try {
                System.out.print(messageInfo);
                String input = SCANNER.nextLine();
                LocalDate date = LocalDate.parse(input, dateFormatter);

                if (!date.isBefore(min) && !date.isAfter(max)) {
                    return date.format(dateFormatter); 
                }
                System.out.println(messageErrorOutOfRange);
            } catch (DateTimeParseException e) {
                System.out.println(messageErrorDate);
            }
        }
    }
}