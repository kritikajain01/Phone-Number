/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

import java.util.Scanner;

/**
 *
 * @author kriti
 */
public class Number_Check {
public static final String INVALID_NUMBER = "0000000000";

    private final String number;
    private final String areaCode;
    private final String prettyFormat;
    
    public Number_Check(String number) {
        this.number = cleanNumber(number);
        this.areaCode = this.number.substring(0, 3);
        this.prettyFormat = prettyFormat(this.number, areaCode);
        
    }
    public String getNumber() {
        return number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String pretty() {
        return prettyFormat;
    }
    
    private static String prettyFormat(String number, String areaCode) {
        return String.format("(%s) %s-%s", areaCode, number.substring(3, 6), number.substring(6));
    }

    private static boolean hasInvalidLength(String number) {
        return (number.length() < 10 || number.length() > 11);
    }

    private static String cleanNumber(String number) {
        number = number.replaceAll("[\\s\\.()-]", "");

        if (hasInvalidLength(number)) {
            return INVALID_NUMBER;
        }
        if (number.length() == 11) {
            if (number.charAt(0) != '1') {
                return INVALID_NUMBER;
            }
            return number.substring(1);
        }
        return number;
    }
}
    
//    static boolean numberOrNot(String input)
//    {
//    try
//        {
//            Integer.parseInt(input);
//        }
//        catch(NumberFormatException ex)
//        {
//            return false;
//        }
//        return true;
//    }
   
//    public static void main(String[] args) {
//        System.out.println("Enter your mobile number");
// 
//        Scanner sc = new Scanner(System.in);
// 
//        String input = sc.next();
//        //String input[100], final[100];
//        int i,j;
//        for (i=0; i< input.length(); i++){
//        
//    if((int)input(i)<48 || (int)input(i)>57)
//        continue;
//        
//    else
//        {
//            
//        }
//    }
    }
}
