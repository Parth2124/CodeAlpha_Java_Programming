
//  #CodeAlpha
//  @codeAlpha

//  Task 1 
// Student Grade TrackerDevelop a program that allows a teacher to enterstudents' grades and compute their average,highest, and lowest scores. You can use arrays to store the student data. 

import java.util.Scanner;

public class TASK_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students in the class: ");
        int numStudents = sc.nextInt();

        int[] grades = new int[numStudents];
        int sum = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            sum = sum + grades[i];
        }

        int highestGrade = grades[0];
        int lowestGrade = grades[0];

        for (int i = 0; i < numStudents; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
        }

        double average = (double) sum / numStudents;

        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        sc.close();
    }
}