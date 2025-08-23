package encapsulation_example;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
    }

    public void inputMarks(int newMarks) {
        System.out.println("Marks are immutable. Updates are not allowed in the current version.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 85);
        s1.displayDetails();
        s1.inputMarks(90);
        s1.displayDetails();
    }
}
