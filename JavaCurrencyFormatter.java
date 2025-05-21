import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
         Locale indiaLocale = new Locale("en", "IN");

         NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US); 
         NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
         NumberFormat  india = NumberFormat.getCurrencyInstance(indiaLocale);
         
         String usFormat = us.format(payment);
         String indiaformat = india.format(payment);
         String chinaformat = china.format(payment);
         String franceformat = france.format(payment);
         
                
        System.out.println("US: " + usFormat);
        System.out.println("India: " + indiaformat);
        System.out.println("China: " + chinaformat);
        System.out.println("France: " + franceformat);
    }
} 
