/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
import java.util.Calendar;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String age = getAge();
        String retAge = getRetAge();
        int numAge = stringToInt(age);
        int numRetAge = stringToInt(retAge);
        int curYear = getYear();
        int timeUntilRet = calcRetTime(numAge, numRetAge);
        int retYear = calcRetYear(timeUntilRet, curYear);
        printOutput (timeUntilRet, retYear, curYear);
    }
    public static String getAge()
    {
        System.out.println( "What is your current age? " );
        return in.nextLine();
    }

    public static String getRetAge()
    {
        System.out.println( "At what age would you like to retire? " );
        return in.nextLine();
    }

    public static int stringToInt(String number)
    {
        return Integer.parseInt(number);
    }

    public static int getYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static int calcRetTime(int numAge, int numRetAge)
    {
        return numRetAge - numAge;
    }

    public static int calcRetYear(int timeUntilRet, int curYear)
    {
        return curYear + timeUntilRet;
    }

    public static void printOutput (int timeUntilRet, int retYear, int curYear)
    {
        System.out.printf( "You have %d years until you can retire.\nIt's %d, so you can retire in %d.",
                timeUntilRet, curYear, retYear );
    }

}