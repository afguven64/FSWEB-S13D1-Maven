package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock < 0 || clock > 23)
            return false;

        return isBarking && (clock > 20 || clock < 8);


    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return ((firstAge <= 19 && firstAge >= 13) ||
               (secondAge <= 19 && secondAge >= 13) ||
               (thirdAge <= 19 && thirdAge >= 13));
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        int maxTemp = isSummer ? 45 : 35;
        return temp >= 25 && temp <= maxTemp;

    }

    public static double area(double width, double height) {

        if (width < 0 || height < 0)
            return -1;

        return width * height;

    }

    public static double area(double radius) {


        if (radius < 0)
            return -1;

        return radius * radius * Math.PI;
    }
}
