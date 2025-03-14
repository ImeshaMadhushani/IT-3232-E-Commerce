class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Students {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 78);
        Student student3 = new Student("Charlie", 92);
        Student student4 = new Student("David", 67);
        Student student5 = new Student("Emma", 88);

        int totalMarks = student1.marks + student2.marks + student3.marks + student4.marks + student5.marks;

        double averageMarks = (double) totalMarks / 5;

        System.out.println("Average Marks: " + averageMarks);
    }
}
