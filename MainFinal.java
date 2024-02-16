package assignment3;

import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserInput userInput = new UserInput();

        System.out.println("Enter the maximum number of records: ");
        int maxSize = scan.nextInt();
        Student[] students = new Student[maxSize];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update/Edit Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    if (count < maxSize) {
                        students[count] = new Student();
                        Object[] studentDetails = userInput.inputStudent();
                        students[count].setName((String) studentDetails[0]);
                        students[count].setPRN((Integer) studentDetails[1]);
                        students[count].setDOB((String) studentDetails[2]);
                        count++;
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Maximum number of records reached.");
                    }
                    break;
                case 2:
                    display(students, count);
                    break;
                case 3:
                    System.out.println("Enter PRN to search: ");
                    int prnToSearch = scan.nextInt();
                    searchByPRN(students, prnToSearch, count);
                    break;
                case 4:
                    System.out.println("Enter Name to search: ");
                    String nameToSearch = scan.next();
                    searchByName(students, nameToSearch, count);
                    break;
                case 5:
                    System.out.println("Enter Position to search: ");
                    int positionToSearch = scan.nextInt();
                    searchByPosition(students, positionToSearch, count);
                    break;
                case 6:
                    System.out.println("Enter PRN to update/edit: ");
                    int prnToUpdate = scan.nextInt();
                    updateStudent(students, prnToUpdate, count);
                    break;
                case 7:
                    System.out.println("Enter PRN to delete: ");
                    int prnToDelete = scan.nextInt();
                    deleteStudent(students, prnToDelete, count);
                    count--;
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void display(Student[] students, int count) {
        if (count > 0) {
            System.out.println("_________________Records______________________");
            for (int i = 0; i < count; i++) {
                System.out.println("____________Record" + (i + 1) + "____________");
                System.out.println("Name of Student: " + students[i].getName());
                System.out.println("PRN of Student: " + students[i].getPRN());
                System.out.println("DOB of Student: " + students[i].getDOB());
            }
        } else {
            System.out.println("No records to display.");
        }
    }

    public static void searchByPRN(Student[] students, int prnToSearch, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getPRN() == prnToSearch) {
                System.out.println("Student found!");
                System.out.println("Name: " + students[i].getName());
                System.out.println("PRN: " + students[i].getPRN());
                System.out.println("DOB: " + students[i].getDOB());
                return;
            }
        }
        System.out.println("Student with PRN " + prnToSearch + " not found.");
    }

    public static void searchByName(Student[] students, String nameToSearch, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println("Student found!");
                System.out.println("Name: " + students[i].getName());
                System.out.println("PRN: " + students[i].getPRN());
                System.out.println("DOB: " + students[i].getDOB());
                return;
            }
        }
        System.out.println("Student with name " + nameToSearch + " not found.");
    }

    public static void searchByPosition(Student[] students, int positionToSearch, int count) {
        if (positionToSearch >= 1 && positionToSearch <= count) {
            Student s = students[positionToSearch - 1];
            System.out.println("Student found at position " + positionToSearch + "!");
            System.out.println("Name: " + s.getName());
            System.out.println("PRN: " + s.getPRN());
            System.out.println("DOB: " + s.getDOB());
        } else {
            System.out.println("Invalid position.");
        }
    }

    public static void updateStudent(Student[] students, int prnToUpdate, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getPRN() == prnToUpdate) {
                System.out.println("Enter new details for student with PRN " + prnToUpdate + ":");
                Object[] updatedDetails = new UserInput().inputStudent();
                students[i].setName((String) updatedDetails[0]);
                students[i].setPRN((Integer) updatedDetails[1]);
                students[i].setDOB((String) updatedDetails[2]);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prnToUpdate + " not found.");
    }

    public static void deleteStudent(Student[] students, int prnToDelete, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getPRN() == prnToDelete) {
                System.arraycopy(students, i + 1, students, i, count - 1 - i);
                System.out.println("Student with PRN " + prnToDelete + " deleted successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prnToDelete + " not found.");
    }
}
