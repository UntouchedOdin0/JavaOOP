package me.untouchedodin0.oop;

public class OOP {

    /*
        Notes:
        Static means you don't need to make a instance of the class
        Instance of a class is Object

        To make a new object, you do something such as

        User user = new User();

        Using "new" in a way of new User(); is a constructor invoking the default constructor for that class.

        The object class e.g. "User" is like a template, it's a cookie cutter what can be used to make a bunch
        more cookies. Just remember you won't use the object class but you'll use it to create the objects of
        which you can use.
     */

    public static void main(String[] args) {
        System.out.println("Hello world"); // Hello world is a argument
        User user = new User(); // Creating a new User object.
//        User user2 = new User(); // Creating another User Object

        /*
            Using the following bit of code assigns the values to the variables of the object.
         */

        user.setName("Caleb");
        user.membership = "Gold";


        System.out.println(user.getName() + " " + user.membership);
    }
}
