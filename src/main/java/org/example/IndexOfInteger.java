package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter an integer (or enter 0 to finish): ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.print("Enter the number you are looking for: ");
        int numberToFind = scanner.nextInt();

        int index = numbers.indexOf(numberToFind);
        if (index != -1) {
            System.out.println("The index of " + numberToFind + " is: " + index);
        } else {
            System.out.println(numberToFind + " is not in the list.");
        }

        scanner.close();
    }
}

