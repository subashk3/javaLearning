package testprograms;

/*
 * import java.time.LocalDate; import java.time.LocalDateTime; import
 * java.time.LocalTime; import java.time.format.DateTimeFormatter; import
 * java.util.ArrayList; import java.util.Collections; import java.util.Scanner;
 * 
 * public class TestAllPrograms {
 * 
 * public static void main(String[] args) { ArrayList<String> cars = new
 * ArrayList<String>(); cars.add("Volvo"); cars.add("BMW"); cars.add("Ford");
 * cars.add("Mazda"); Collections.sort(cars);; // Sort cars for (String i :
 * cars) { System.out.println(i); } } }
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.nextLine();
        
        System.out.println("String: " +c);
        System.out.println("Double: " +b);
        System.out.println("Int: " +a);                        
    }
}