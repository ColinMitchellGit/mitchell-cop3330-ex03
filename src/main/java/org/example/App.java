/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = scanner.nextLine();

        System.out.print("Who said it? ");
        String name = scanner.nextLine();

        System.out.println(name + " says, \"" + quote + "\"");
    }
}
