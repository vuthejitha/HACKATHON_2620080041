import java.util.Scanner;

class Student {

    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    Student(String studentName, int rollNumber, double marks,
            String courseName, int courseCredits) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Course Fee
    double calculateFee() {
        return courseCredits * 1500;
    }
    // Check Eligibility
    boolean checkEligibility() {
        if (marks >= 50)
            return true;
        else
            return false;
    }

    // Scholarship
    double calculateScholarship() {

        double fee = calculateFee();

        if (marks >= 85)
            return fee * 20 / 100;
        else if (marks >= 70)
            return fee * 10 / 100;
        else
            return 0;
    }

    // Final Fee
    double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    // Details
    void displayDetails() {

        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);

        System.out.println("\n--- Course Details ---");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);

        System.out.println("\nEligibility: Eligible");
        System.out.println("Total Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        sc.nextLine();

        // course details
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        // eligibility
        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for course registration.");
        }

        sc.close();
    }
}