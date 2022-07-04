package oopLab14;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab14_2 implements DayOfWeek {
    public static String[] listOfTheDay = {"Почистити зуби", "Вмитись", "Сніданок", "Какаю", "Сплю", "Працюю", "Відпочиваю", "Вечеря", "Душ"};

    @Override
    public void monday(String[] listOfTheDay) {
        System.out.println("Monday: " + listOfTheDay[1] + ", " + listOfTheDay[2] + ", " + listOfTheDay[5]);
    }

    @Override
    public void tuesday(String[] listOfTheDay) {
        System.out.println("Tuesday: " + listOfTheDay[0] + ", " + listOfTheDay[3] + ", " + listOfTheDay[4]);
    }

    @Override
    public void wednesday(String[] listOfTheDay) {
        System.out.println("Wednesday: " + listOfTheDay[1] + ", " + listOfTheDay[4] + ", " + listOfTheDay[6]);
    }

    @Override
    public void thursday(String[] listOfTheDay) {
        System.out.println("Thursday: " + listOfTheDay[2] + ", " + listOfTheDay[3] + ", " + listOfTheDay[7]);
    }

    @Override
    public void friday(String[] listOfTheDay) {
        System.out.println("Friday: " + listOfTheDay[0] + ", " + listOfTheDay[3] + ", " + listOfTheDay[8]);
    }

    @Override
    public void saturday(String[] listOfTheDay) {
        System.out.println("Saturday: " + listOfTheDay[1] + ", " + listOfTheDay[2] + ", " + listOfTheDay[5] + ", " + listOfTheDay[8]);
    }

    @Override
    public void sunday(String[] listOfTheDay) {
        System.out.println("Sunday: " + listOfTheDay[0] + ", " + listOfTheDay[4] + ", " + listOfTheDay[6] + ", " + listOfTheDay[8]);
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            Lab14_2 functions = new Lab14_2();
            switch (x) {
                case 1:
                    functions.monday(Lab14_2.listOfTheDay);
                    break;
                case 2:
                    functions.tuesday(Lab14_2.listOfTheDay);
                    break;
                case 3:
                    functions.wednesday(Lab14_2.listOfTheDay);
                    break;
                case 4:
                    functions.thursday(Lab14_2.listOfTheDay);
                    break;
                case 5:
                    functions.friday(Lab14_2.listOfTheDay);
                    break;
                case 6:
                    functions.saturday(Lab14_2.listOfTheDay);
                    break;
                case 7:
                    functions.sunday(Lab14_2.listOfTheDay);
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
        } catch (IllegalStateException  e) {
            System.out.println("Restart pls");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Enter integer number");
        }
    }
}
