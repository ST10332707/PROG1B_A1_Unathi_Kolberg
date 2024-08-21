/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
////--------------------------------------------------------------------------UNK.....----------------------------------------------------------////
package com.mycompany.prog1b_ass1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Unath
 */
public class WorkerClass {
    
    private Scanner input = new Scanner(System.in);// Scanner object to take user input
    
    // Fields to store student information
    private int studentId;
  
    private String firstname;
    
    private int studentAge;
    
    private String studentEmail;
    
    private String studentCourse;
    
    private List<WorkerClass> students = new ArrayList<>();//arraylist where all the data is going to be stored in
    
    public WorkerClass(){
        //This is the default constructor
    }
  
    // constructor
    public WorkerClass(int id, String fn, int a, String email, String crs) {
        this.studentId = id;
        this.firstname = fn;
        this.studentAge = a;
        this.studentEmail = email;
        this.studentCourse = crs;
    }
    @Override
    public String toString() {
        return "[" + getStudentId() + ", " + getfirstname() + ", " + getStudentAge() + ", " + getStudentEmail() + "]";
    }
    
    //getters and setters 
    ///-----------------------------------------------------------------------//
    public void setStudentId(int id) {
        studentId = id;
    }
    public int getStudentId() {
        return studentId;
    }
    
    ///-----------------------------------------------------------------------//
    public void setfirstname(String fn) {
        firstname = fn;
    }
    public String getfirstname() {
        return firstname;
    }
    
    ///--------------------------------------------------------------------------//
    public void setStudentAge(int a) {
        studentAge= a;
    }
    public int getStudentAge() {
        return studentAge;
    }
    
    //--------------------------------------------------------------------------//
    public void setStudentEmail(String email) {
        studentEmail= email;
    }
    
    public String getStudentEmail() {
        return studentEmail;
    }
    
    //--------------------------------------------------------------------------//
    public void setStudentCourse(String crs) {
        studentCourse = crs;
    }
    
    public String getStudentCourse() {
        return studentCourse;
    }
    
    //display the menu
    public void logins() {
        System.out.println("1..Capture a new User");
        System.out.println("2..Search for a student");
        System.out.println("3..Delect a student");
        System.out.println("4..Print Student Report");
        System.out.println("5..Exit Application");
    }
    
    public String getOptions() {
        return this.input.nextLine();
    }
    
    //method to get and save student data from user
    public void saveStudent() {
        
        System.out.println("Enter your student id: ");
        int id = this.input.nextInt();
        input.nextLine();
        
        System.out.println("Enter your Name: ");
        String fn = this.input.nextLine();

        int a = GetAge();
                
        System.out.println("Enter your Email: ");
        String email = this.input.nextLine();
        
        System.out.println("Enter your course: ");
        String crs = this.input.nextLine();
        
        WorkerClass student = new WorkerClass(id, fn, a, email, crs);
        students.add(student);//save data in the Arraylist
        
        System.out.println("Student added successfully!");
    }
    
    //method to print Student report
    public void StudentReport() {
        int count =1 ;
        for(WorkerClass student : students) {//for loop to iterate through the Arraylist and dispaly the data 
           System.out.println("Student " + count);
            System.out.println("-------------");
            System.out.println("Student Id: " + student.getStudentId());
            System.out.println("Student Name: " + student.getfirstname());
            System.out.println("Student Age: " + student.getStudentAge());
            System.out.println("Student Email: " + student.getStudentEmail());
            System.out.println("Student Course: " + student.getStudentCourse());
            System.out.println(); // Open line 
            count++;//increment the count by 1
           
       }
    }
    
    //method to check if age is valid
    private int GetAge()
    {
        System.out.println("Enter your age: ");//propmt the user to enter age
        int a = this.input.nextInt();
        input.nextLine();
        
        if(!checkAge(a))
        {
            System.out.println("You have entered a incorrect student Age. Please Re Enter!");
            GetAge();
        }
        return a;     
    }
     
    // 
    public void dispatchLoop() {
        
        System.out.println("Enter 1 to launch the menu or any other key to exit: ");
        String choice = input.nextLine(); 
        
        if ("1".equals(choice)) {//check if the user enter 1 
            while(true) {//while to execute the code below 
                logins();//display menu
                String options = getOptions();
                switch(options) {
                    case "1" : saveStudent();break;//enable the user to capture user when 1 is entered
                    case "2" : searchStudent(); break;//search for student when 2 is entered
                    case "3" : deleteStudent(); break;//delete student
                    case "4" : StudentReport(); break;//display student report when 4 is eneter
                    case "5" : System.exit(0);//exit 5 is enter
                    default:
                        System.out.println("Invalid option. Please try again.");
                }  
            }    
        }
    }
    
    //method to check if age is valid
    private boolean checkAge(int a) {
        return a >= 16;
    }
    
    //method to search for a student using student id
    public void searchStudent() {
        //propmt the user to enter id 
        System.out.println(" Please enter your student ID to search: ");
        int id = input.nextInt();
        input.nextLine();

        boolean found = false;// Flag to check if student was found
        for (WorkerClass student : students) {//for loop to iterate through the Arraylist and dispaly the data
            if (student.getStudentId() == id) {
                System.out.println("Student Id: " + student.getStudentId());
                System.out.println("Student Name: " + student.getfirstname());
                System.out.println("Student Age: " + student.getStudentAge());
                System.out.println("Student Email: " + student.getStudentEmail());
                System.out.println("Student Course: " + student.getStudentCourse());
                found = true;
                break;//exit the loop
            }
        }
        //if id is not found
        if (!found) {
            System.out.println("Student not found.");
        }
    }
    
    //metod to delete student using student id
    public void deleteStudent() {
        System.out.println(" Please enter your student ID to search: ");
        int id = input.nextInt();
        input.nextLine();

        boolean found = false;// Flag to check if student was found
        for (WorkerClass student : students) {//for loop to iterate through the Arraylist and dispaly the data
            if (student.getStudentId() == id) {
                students.remove(student);
                System.out.println("Student has been deleted.");
                found = true;
                break;//exit the loop
            }
        }
        //if id is not found
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
////--------------------------------------------------------------------------UNK.....----------------------------------------------------------////
