/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog1b_ass1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Unath
 */
public class WorkerClass {
    
    private Scanner input = new Scanner(System.in);
    
    private int prompt;
    
    private int studentId;
  
    private String firstname;
    
    private int studentAge;
    
    private String studentEmail;
    
    private String studentCourse;
    
    private List<WorkerClass> students = new ArrayList<>();
    
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
        return "[" + getPrompt() + ", " + getStudentId() + ", " + getfirstname() + ", " + getStudentAge() + ", " + getStudentEmail() + "]";
    }
    //------------------------------------------------------------------------//
    public void setPrompt(int p) {
        prompt = p;
    }
    public int getPrompt() {
        return prompt;
    }
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
        
        
//        setStudentId(id);
//        setfirstname(fn);
//        setStudentAge(a);
//        setStudentEmail(email);
//        setStudentCourse(crs);
        
        WorkerClass student = new WorkerClass(id, fn, a, email, crs);
        students.add(student);
        
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
     
     
    public void dispatchLoop() {
        
        System.out.println("Enter 1 to launch the menu or any other key to exit: ");
        String choice = input.nextLine(); 
        
        if ("1".equals(choice)) {
            while(true) {
                logins();
                String options = getOptions();
                switch(options) {
                    case "1" : saveStudent();break;
                    case "2" : searchStudent(); break;
                    case "3" : deleteStudent(); break;
                    case "4" : StudentReport(); break;
                    case "5" : System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }  
            }    
        }
    }
    
    private boolean checkAge(int a) {
        return a >= 16;
    }
    
    public void searchStudent() {
        System.out.println(" Please enter your student ID to search: ");
        int id = input.nextInt();
        input.nextLine();

        boolean found = false;
        for (WorkerClass student : students) {
            if (student.getStudentId() == id) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
    
    public void deleteStudent() {
        System.out.println(" Please enter your student ID to search: ");
        int id = input.nextInt();
        input.nextLine();

        boolean found = false;
        for (WorkerClass student : students) {
            if (student.getStudentId() == id) {
                students.remove(student);
                System.out.println("Student has been deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
