/*1. Singly Linked List: Student Record Management
Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes. */
class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentRecordManagement {
    private Student head;


    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        if (position == 0) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newStudent.next = current.next;
        current.next = newStudent;
    }


    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
  
        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public Student searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void displayAllRecords() {
        Student current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        srm.addAtEnd(1, "Alice", 20, "A");
        srm.addAtBeginning(2, "Bob", 21, "B");
        srm.addAtPosition(3, "Charlie", 22, "C", 1);
        srm.displayAllRecords();
        System.out.println("Deleting Roll Number 1");
        srm.deleteByRollNumber(1);
        srm.displayAllRecords();
    }
}