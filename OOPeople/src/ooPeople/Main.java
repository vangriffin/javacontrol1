package ooPeople;

import java.util.ArrayList;
import java.util.Scanner;

import Main.Student;

public class Main {

  public static void main(String[] args) {
    
    Student newStudent = new Student();
    newStudent.setName("Michael");
    newStudent.setAge(20);
    newStudent.setGradYear(2020);
    
    System.out.println("Name: " + newStudent.getName() + "\nAge: "
        + newStudent.getAge() + "\nGraduation Year: " + newStudent.getGradYear()
        + "\nEnrolled? " + newStudent.isEnrolled());
    
    System.out.println(newStudent.toString());

    newStudent.enrollStudent();
    System.out.println("Name: " + newStudent.getName() + "\nAge: "
        + newStudent.getAge() + "\nGraduation Year: " + newStudent.getGradYear()
        + "\nEnrolled? " + newStudent.isEnrolled());
    
    System.out.println(newStudent.toString());

    ArrayList<Student> studentListA = new ArrayList<Student>();

    Student studentA = new Student();
    studentA.setName("Michael");
    studentA.setAge(20);
    studentA.setGradYear(2020);
    studentListA.add(studentA);

    Student studentB = new Student();
    studentB.setName("Janice");
    studentB.setAge(32);
    studentB.setGradYear(2019);
    studentListA.add(studentB);

    for (Student student : studentListA) {
      System.out.println("Name: " + student.getName() + "\nAge: "
          + student.getAge() + "\nGraduation Year: " + student.getGradYear()
          + "\nEnrolled? " + student.isEnrolled());
    }
    
    for (Student student : studentListA) {
      System.out.println(student.toString());
    }

    ArrayList<Student> studentListB = new ArrayList<Student>();
    
    studentListB.add(Student.addStudents("Angela", 43, 1996, false));
    studentListB.add(Student.addStudents("Daniel", 33, 2002, true));
    studentListB.add(Student.addStudents("Ronald", 19, 2021, false));

    for (Student student : studentListB) {
      System.out.println("Name: " + student.getName() + "\nAge: "
          + student.getAge() + "\nGraduation Year: " + student.getGradYear()
          + "\nEnrolled? " + student.isEnrolled());
    }
    
    for (Student student : studentListB) {
      System.out.println(student.toString());
    }

    Scanner userInput = new Scanner(System.in);
    
    ArrayList<Student> studentListC = new ArrayList<Student>();
    
    String studentName;
    int studentAge;
    int studentGradYear;
    boolean enrollmentStatus;
    String complete = "no";

    while (complete.equalsIgnoreCase("n")
        || complete.equalsIgnoreCase("no")) {

      System.out.println("Enter student name:");
      studentName = userInput.nextLine();

      System.out.println("Enter student age:");
      studentAge = Integer.parseInt(userInput.nextLine());

      System.out.println("Enter graduation year:");
      studentGradYear = Integer.parseInt(userInput.nextLine());

      System.out.println("Enter enrollment status (true or false):");
      enrollmentStatus = Boolean.parseBoolean(userInput.nextLine());

      studentListC.add(Student.addStudents(studentName, studentAge,
          studentGradYear, enrollmentStatus));

      System.out.println("List complete? Enter yes or no:");
      complete = userInput.nextLine();

    }

    userInput.close();

    for (Student student : studentListC) {
      System.out.println("Name: " + student.getName() + "\nAge: "
          + student.getAge() + "\nGraduation Year: " + student.getGradYear()
          + "\nEnrolled? " + student.isEnrolled());
    }
    
    for (Student student : studentListC) {
      System.out.println(student.toString());
    }

  }

}