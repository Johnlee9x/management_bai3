package util;

import java.util.Scanner;

public class MyUtil {
    static Scanner sc = new Scanner(System.in);
    public static int getAnInteger(String inputMsg, String errMsg, int minNum, int maxNum){
        int n;
        System.out.println(inputMsg);
        while (true){
            try {
                n = Integer.parseInt(sc.nextLine());
                if(n < minNum || n > maxNum){
                    throw new Exception();
                }
                return n;
            }
            catch (NumberFormatException e){
                System.out.println("NumberFormatException and Try again");
            }
            catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    public static String getString(String inputMsg, String errorMsg, String format) {
        String id;
        boolean match;
        while (true) {
            System.out.println(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.isEmpty() || !match)
                System.out.println(errorMsg);
            else
                return id;
        }
    }
    public static String getString(String inputMsg, String errorMsg) {
        String str;
        while (true) {
            System.out.println(inputMsg);
            str = sc.nextLine();
            if (str.isEmpty())
                System.out.println(errorMsg);
            else
                return str;
        }
    }
}
