/*
 * W3Resource: Java OOP - Exercise 1
 * Topic: Default Constructor
 * Problem: Create a class "Cat" with name and age. 
 * Default constructor sets name to "Unknown" and age to 0.
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Cat myCat = new Cat();
        
        // Printing the values
        myCat.printDetails();
    }
}

 class Cat {
    // Instance variables
    String name;
    int age;

    // 1. Default Constructor
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void printDetails() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Age: " + age);
    }

}
