
//import bank;
package Oopsjava;

class pen {
     String colour;
     String type; //ballpen , gel , etc.

     public void write() {
         System.out.println("Write something");
     }

     public void printcolour() {
         System.out.println(this.colour);
     }
 }
 class Student{
     String name;
     int age;
     public void printinfo(){
         System.out.println(this.name);
         System.out.println(this.age);
     }
     Student(){
         System.out.println("constructor called");
     }
 }
 // inheritance in java : in this we can use methods of another class  inn some another class:
  class Shape {
     String colour;
     int data;
 }
   class Triangle extends Shape{

   }
    public class Oops {

        public static void main(String[] args) {
            // write your code here
            pen pen1 =  new pen();
            pen1.colour = "Black";
            pen1.type = "gel";
            pen1.write();
            pen1.printcolour();
            Student s1 = new Student();
            s1.name = "Aditya";
            s1.age = 20;
            s1.printinfo();

            Triangle t1 = new Triangle();
            t1.colour = "Black";
            t1.data = 3;
            System.out.println(t1.data);
           // bank.Account account1 = new bank.Account();

        }
    }

