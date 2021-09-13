/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = scan.nextLine();
        System.out.println(input + " has " + checkLength(input) + " characters.");
    }

    public static int checkLength(String input) {
        return input.length();
    }
}
