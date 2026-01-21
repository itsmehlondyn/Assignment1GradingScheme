/*************************************************************************
* Project 1 for CSCI 271-001 Spring 2026
*
* Author: Londyn Pepperdine
* OS: Ubuntu Debian Linux 21.1
* Compiler: javac 25.0.1
* Date: Jan 22, 20
*
* Purpose:
*
*
*
*************************************************************************/
/*************************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Londyn Pepperdine
* W30589204
*************************************************************************/

import java.util.Scanner;

public class grades
{
    public static void main(String[] args)
    {
        double sumTest = 0.0; //Sum for tests
        double sumAssignment = 0.0; //Sum for assignments

        Scanner input = new Scanner(System.in);

        //while(input != '-1')
       // {

            //Get 7 test grades from user
            for (int i = 0; i < 7; ++i)
            {
                System.out.print("Enter your 7 assignment grades: ");
                int Assignment = input.nextInt();
                sumAssignment += Assignment;
            }

            //Average assignment grades ****************************************
            double A = sumAssignment/7;
            System.out.println("Average grade for assignments " + A);

            //Get 7 test grades from user
            for (int i = 0; i < 7; ++i)
            {
                System.out.print("Enter your 7 test grades: ");
                int Test = input.nextInt();
                sumTest += Test;
            }
            //Average test grades
            double T = sumTest/7;
            System.out.println("Average grade for tests " + T);

            //Get midterm grade from user***************************************
            System.out.print("Enter your Midterm Exam Grade: ");
            int M = input.nextInt();

            //Get final grade from user*****************************************
            System.out.print("Enter your Final Exam Grade: ");
            int F = input.nextInt();



            double E = (((0.40*F)+(0.20*M)+(0.10*T))/0.70);
            System.out.println("Calc of E " + E);

            double W = (((E-60)/20)*0.30);
            System.out.println("Calc of W " + W);

            if (E < 60 )
            {
                System.out.println("Your grade is less than 60 " + E);
            }
            else if (E >= 60 && E < 80)
            {
                System.out.println("Your grade is greater than 60 and less than 80 " + ((1-W)*(E+W*A)));
            }
            else if (E >= 80){
                System.out.println("Your grade is greater than 80 " + ((0.4*F)+(0.2*M)+(0.1*T)+(0.3*A)));
            }
            
            }

        
        input.close();

    //}
}
