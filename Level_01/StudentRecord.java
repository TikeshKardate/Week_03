/*
1. Singly Linked List: Student Record Management
Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes.
*/

import java.util.Scanner;
class Student{
    String name;
    int rollno;
    int age;
    char grade;
    Student next;
    public Student(String name,int age,int rollno,char grade){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.grade=grade;
        next=null;
    }

}


public class StudentRecord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student("Rahul", 10, 101, 'A');
        Student s2=new Student("Vishnu", 31, 102, 'A');
        Student s3=new Student("Amol", 35, 103, 'A');
        Student s4=new Student("Bhuvan", 27, 104, 'C');
        Student s5=new Student("Tikesh", 21, 105, 'B');
        Student s6=new Student("Pappu", 21, 106, 'C');
        Student s7=new Student("Neeraj", 21, 107, 'A');
        s1.next=s2;
        s2.next=s3; s3.next=s4; s4.next=s5;s5.next=s6; s6.next=s7;
        System.out.println("Displayng the details of all the student:- ");
        Student temp=s1;
        int i=1;
        while(temp!=null){
            System.out.println("Name of the "+i+"st student is "+ temp.name);
            System.out.println("Age of the "+i+"st student is "+ temp.age);
            System.out.println("Rollno. of the "+i+"st student is "+ temp.rollno);
            System.out.println("Grade of the "+i+"st student is "+ temp.grade);
            i++;
          temp=temp.next;
          System.out.println();
        }
        System.out.print("Enter roll no. to show the details of specific student: ");
        int roll=sc.nextInt();

        temp=s1;
        int a=0;
        while(temp!=null){
            if(temp.rollno == roll){
           System.out.println("Name of the "+" student is "+ temp.name);
            System.out.println("Age of the "+" student is "+ temp.age);
            System.out.println("Grade of the "+" student is "+ temp.grade);
            a=1;
             break;
            }
            temp=temp.next;
        }
        if(a==0){
            System.out.println("Student with rollno "+ roll +" is not present");
        }

    }

}