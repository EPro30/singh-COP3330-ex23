/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exTroubleshootCarIssues {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        char ch = sc.next().charAt(0);

        if(ch == 'y' || ch == 'Y')
        {
            System.out.println("Are the battery terminals corroded?");
            ch = sc.next().charAt(0);
            if(ch == 'y' || ch == 'Y')
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else if(ch == 'n' || ch == 'N')
            {
                System.out.println("Replace cables and try again.");
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
        else if(ch == 'n' || ch == 'N')
        {
            System.out.println("Does the car make a slicking noise?");
            ch = sc.next().charAt(0);
            if(ch == 'y' || ch == 'Y')
            {
                System.out.println("Replace the battery.");
            }
            else if(ch == 'n' || ch == 'N')
            {
                System.out.println("Does the car crank up but fail to start?");
                ch = sc.next().charAt(0);
                if(ch == 'y' || ch == 'Y')
                {
                    System.out.println("Check spark plug connections.");
                }
                else if(ch == 'n' || ch == 'N')
                {
                    System.out.println("Does the engine start and then die?");
                    ch = sc.next().charAt(0);
                    if(ch == 'y' || ch == 'Y')
                    {
                        System.out.println("Does you car have fuel injection?");
                        ch = sc.next().charAt(0);
                        if(ch == 'y' || ch == 'Y')
                        {
                            System.out.println("Get it in for service.");

                        }
                        else if(ch == 'n' || ch == 'N')
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                        else
                        {
                            System.out.println("Invalid choice");
                        }
                    }
                    else if(ch == 'n' || ch == 'N')
                    {
                        System.out.println("This should not be possible.");
                    }
                    else
                    {
                        System.out.println("Invalid choice");
                    }
                }
                else
                {
                    System.out.println("Invalid choice");
                }
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
