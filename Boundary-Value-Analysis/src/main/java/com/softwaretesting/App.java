/********************************************************************************************************
 * Created by: Swati Rajwal
 * BOUNDARY VALUE ANALYSIS
 * Problem: Triangle Problem. 
 * Description: According to the problem, the program should accept three sides of a triangle
 *              and identify if the Equilateral Triangle, Isosceles Triangle, Scalene or Not a Traingle.
 * For more details about the test case generation, please go to #$@@@#%%^ 
 *********************************************************************************************************/

package com.softwaretesting;

public class App {
    
    
    
    public static String classify(int X, int Y, int Z) {
        if ((X <= 0) || (Y <= 0) || (Z <= 0)) {
          return "Not a triangle";
        }
        int boundary = 0;
        if (X == Y) {
            boundary = boundary + 1;
        }
        if (X == Z) {
            boundary = boundary + 2;
        }
        if (Y == Z) {
            boundary = boundary + 3;
        }
        if (boundary == 0) {
          if (((X + Y) < Z) || ((X + Z) < Y) || ((Y + Z) < X)) {
            return "Not a triangle";
          } else {
            return "Scalene";
          }
        }
        if (boundary > 3) {
          return "Equilateral";
        }
        if ((boundary == 1) && ((X + Y) > Z)) {
          return "Isosceles";
        } else if ((boundary == 2) && ((X + Z) > Y)) {
          return "Isosceles";
        } else if ((boundary == 3) && ((Y + Z) > X)) {
          return "Isosceles";
        }
        return "Not a triangle";
      }

    
    public static void main(String[] args) {
        // App appObject = new App();
        

        System.out.println(App.classify(1, 5, 5));
        System.out.println(App.classify(2, 5, 5));
        System.out.println(App.classify(9, 5, 5));
        System.out.println(App.classify(10, 5, 5));
        System.out.println(App.classify(5, 1, 5));
        System.out.println(App.classify(5, 2, 5));
        System.out.println(App.classify(5, 9, 5));
        System.out.println(App.classify(5, 10, 5));
        System.out.println(App.classify(5, 5, 1));
        System.out.println(App.classify(5, 5, 2));
        System.out.println(App.classify(5, 5, 9));
        System.out.println(App.classify(5, 5, 10));
        System.out.println(App.classify(5, 5, 5));
    }
}
