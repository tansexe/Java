class Student {
    String name;
    int rollNo;

    public void insertRecord(String n, int r) {
        name = n;
        rollNo = r;

    }

    public void display() {
        System.out.println("Student Name:" + name);
        System.out.println("Roll No:" + rollNo);
    }
}

public class StudentData {

    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.insertRecord("Taniya", 101);
        S2.insertRecord("Somya", 102);

        S1.display();
        S2.display();
    }
}
