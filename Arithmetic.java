package ThirtyDaysChallenge;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      System.out.println(M);
      System.out.println(T);
      System.out.println(X);
      
double tip = (T*M)/100;
System.out.println("Tip for the meal " + tip);
double tax = (X*M)/100;
System.out.println("Tax for the meal " + tax);
double finalPrice = M +tip+tax;
System.out.println("finalPrice for the meal" + finalPrice);
int roundvalue = (int) Math.round(finalPrice);
System.out.println(roundvalue);
    }
}


      
    
