import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Number of Backlogs: ");
        int backlogs = sc.nextInt();

        System.out.println("\n----- Student Details -----");
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Backlogs: " + backlogs);

        boolean eligible = cgpa >= 6.0 && backlogs == 0;

        System.out.println("\nCompany: Infosys");

        if (eligible) {
            System.out.println("Status: Eligible for Placement");

            System.out.println("\n----- Interview Slot -----");
            System.out.println("Candidate Name: " + name);
            System.out.println("Date: 15 November 2026");
            System.out.println("Time: 10:00 AM");
        } else {
            System.out.println("Status: Not Eligible for Placement");
        }

        System.out.println("---------------------------");

        sc.close();
    }
}
