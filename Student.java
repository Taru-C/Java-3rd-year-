public class Student {

    String name;
    int rollNo;
    String department;
    double marks;

    
    Student() {
        name = "Rakshita";
        rollNo = 1;
        department = "CSE";
        marks = 85.5;
    }


    Student(String n, int r, String d, double m) {
        name = n;
        rollNo = r;
        department = d;
        marks = m;
    }


    Student(Student s) {
        name = s.name;
        rollNo = s.rollNo;
        department = s.department;
        marks = s.marks;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
        System.out.println("Department = " + department);
        System.out.println("Marks = " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();   

        Student s2 = new Student("Rahul", 2, "IT", 90.5);   // Parameterized Constructor

        Student s3 = new Student(s2); 

        System.out.println("Default Constructor");
        s1.display();

        System.out.println("Parameterized Constructor");
        s2.display();

        System.out.println("Copy Constructor");
        s3.display();
    }
}