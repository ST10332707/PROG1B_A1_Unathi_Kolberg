/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog1b_ass1;

import java.util.Scanner;

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
    
    private String username;
    
    private String password;
    
    public WorkerClass(){
        //This is the default constructor
    }
    
    // constructor
    public void UserAccount(int p, int id, String fn, int a, String email, String crs) {
        studentId = id;
        firstname = fn;
        studentAge = a;
        studentEmail = email;
        studentCourse = crs;
        prompt = p;
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
    public void setusername(String un) {
        username = un;
    }
    
    public String getusername() {
        return username;
    }
    
    //--------------------------------------------------------------------------//
    public void setStudentCourse(String crs) {
        studentCourse = crs;
    }
    
    public String getStudentCourse() {
        return studentCourse;
    }
    
    //--------------------------------------------------------------------------//
    
    public void setpassword(String p) {
        password = p;
    }
    
    public String getpassword() {
        return password;
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
    
    public void createUserAccount() {
        
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
        
        setStudentId(id);
        setfirstname(fn);
        setStudentAge(a);
        setStudentEmail(email);
        setStudentCourse(crs);
        
        //System.out.println(registerUser());
    }
    
     public void display() {
       System.out.println(toString());
    }
     
    private int GetPromptUser()
    {
        System.out.println("Enter (1) to launch menu or any other key to exit: ");
        int p = this.input.nextInt();
        input.nextLine();
        
        if(FistInput(p))
        {
            System.out.println("You have entered a incorrect student Age. Please Re Enter!");
            dispatchLoop();
        } else {
            System.exit(0);  
        }
        return p;       
    }
     
    private int GetAge()
    {
        System.out.println("Enter your age: ");
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
                    case "1" : createUserAccount();break;
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
    
    private boolean FistInput(int p) {
        return p == 1;
    }
}
