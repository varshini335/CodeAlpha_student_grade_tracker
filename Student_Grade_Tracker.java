import java.util.Scanner;

public class Student_Grade_Tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of students:");
        int n = sc.nextInt();
        System.out.println();
        String[] names = new String[n];
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the student %d name and grade: ", i + 1);
            names[i] = sc.next();
            grades[i] = sc.nextInt();
        }
        float avg = 0.0f;
        int max = grades[0], min = grades[0];
        for (int i = 0; i < n; i++) {
            avg += grades[i];
            if (grades[i] > max)
                max = grades[i];
            if (grades[i] < min)
                min = grades[i];
        }
        System.out.println();
        System.out.println("Summary report of all students:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
        System.out.println();
        System.out.println("Average Score: " + avg / n);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
    }
}
