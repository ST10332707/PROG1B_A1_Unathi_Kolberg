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
    
    private int studentId;
  
    private String firstname;
    
    private int studentAge;
    
    private String studentEmail;
    
    private String username;
    
    private String password;
    
    public WorkerClass(){
        //This is the default constructor
    }
    
    // constructor
    public void UserAccount(int id, String fn, int a, String email, String un, String p) {
        studentId = id;
        firstname = fn;
        studentAge = a;
        studentEmail = email;
        username = un;
        password = p;
    }
    @Override
    public String toString() {
        return "[" + getStudentId() + " , " + getfirstname() + ", " + getStudentAge() + ", " + getStudentEmail() + ", " + getusername() + ", " + getpassword() + "]";
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
    
    public void setpassword(String p) {
        password = p;
    }
    
    public String getpassword() {
        return password;
    }
    
    public void logins() {
        System.out.println("a..Capture a new User");
        System.out.println("b..Login User");
        System.out.println("c..Display User information");
        System.out.println("d..Quit");
    }
    
    public String getOptions() {
        return this.input.nextLine();
    }
    
    public void createUserAccount() {
        
        System.out.println("Enter your student id: ");
        int id = this.input.nextLine();
        
        System.out.println("Enter your firstname: ");
        String fn = this.input.nextLine();
        
        System.out.println("Enter your student id: ");
        int a = this.input.nextLine();
        
        System.out.println("Enter your Email: ");
        String email = this.input.nextLine();
        
        String un = GetUserName();
        
        String p = GetPassword();
        
        setStudentId(id);
        setfirstname(fn);
        setStudentAge(a);
        setStudentEmail(email);
        setusername(un);
        setpassword(p);
        
        //System.out.println(registerUser());
    }
    
    private String GetUserName()
    {
        System.out.println("Enter your username: ");
        String un = input.nextLine();
        
//        if(!checkUsername(un))
//        {
//            System.out.println("UserName not Correct. Please Re Enter!");
//            GetUserName();
//        }
        return un;     
    }
    
    public String GetPassword() {
        
        System.out.println("Enter your password: ");
        String p = input.nextLine();
        
//        if(!checkPasswordComplexity(p))
//        {
//            System.out.println("Password not Correct. Please Re Enter!");
//            GetPassword();
//        }
        
        return p;   
    }
    
     public void display() {
       System.out.println(toString());
    }
//     
//      public boolean loginUser(String un, String p) {
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println(registerUser());
//        
//        System.out.println("Enter a username to login: ");
//        String uns = input.nextLine();
//        
//        System.out.println("Enter a password: ");
//        String pw = input.nextLine();
//        if(uns.equals(username) && pw.equals(password)) {
//            System.out.println("Welcome to EasyKanban");
//            return true; 
//        }
//        return false; 
//    }
//    
//    public void dispatchLoop() {
//        while(true) {
//            logins();
//            String options = getOptions();
//            switch(options) {
//                case "a" : createUserAccount();break;
//                case "b" : loginUser(getusername(), getpassword());
//                System.out.println(returnLoginStatus(getusername(), getpassword()));break;
//                case "c" : display();break;
//                case "d" : System.exit(0);
//                if(loginUser(options, options)== true) {
//                    myMenu();
//                    break;
//                }
//            }
//        }
//    }
    
}
