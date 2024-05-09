Introduction:
This Java program manages student records through user input. It allows users to add, display, search, update, and delete student records using methods defined in the UserInput and MainFinal classes.

UserInput class:
inputStudent(): This method prompts the user to input the name, PRN (Personal Roll Number), and date of birth (DOB) of a student. It stores the input in an array and returns it to the caller.

MainFinal class:
- main(String[] args): This is the entry point of the program. It initializes necessary variables, creates an instance of UserInput, and manages the menu-driven interface for adding, displaying, searching, updating, and deleting student records based on user input.
- display(Student[] students, int count): This method displays all stored student records. It iterates through the array of Student objects and prints out their details.
- searchByPRN(Student[] students, int prnToSearch, int count): Searches for a student record by PRN (Personal Roll Number) in the array of Student objects. If found, it prints the details of the student.
- searchByName(Student[] students, String nameToSearch, int count): Searches for a student record by name in the array of Student objects. If found, it prints the details of the student.
- searchByPosition(Student[] students, int positionToSearch, int count): Searches for a student record by its position in the array of Student objects. If found, it prints the details of the student.
- updateStudent(Student[] students, int prnToUpdate, int count): Updates the details of a student record based on the PRN (Personal Roll Number) provided by the user.
- deleteStudent(Student[] students, int prnToDelete, int count): Deletes a student record based on the PRN (Personal Roll Number) provided by the user. It shifts the remaining records in the array to fill the gap created by the deletion.

Student class:
- The Student class encapsulates the attributes and behavior of a student record. Below is an explanation of the Student class.
- name, prn, and dob are private instance variables representing the name, PRN (Personal Roll Number), and date of birth of a student, respectively.
- The class provides a default constructor.
- Getter and setter methods are provided for accessing and modifying the private instance variables.
- This class acts as a blueprint for creating Student objects, each representing an individual student record with a name, PRN, and DOB. These objects are used throughout the program to store and manipulate student data.
