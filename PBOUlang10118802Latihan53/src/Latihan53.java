/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan53 {

    protected static boolean vegetarian;
    protected static String eats;
    protected static int noOfLegs;
    private static String color;
    private static String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
       Animal animal = new Animal(false, "grass", 4);
       Rabbit rabbit = new Rabbit("grey", "Peter", false, "grey", 4);
       System.out.println("Hello, His name is " + rabbit.getName());
       System.out.println(rabbit.getName() + " is Vegetarian? " + 
                          rabbit.vegetarian);
       System.out.println(rabbit.getName() + " eats " + animal.eats);
       System.out.println(rabbit.getName() + " has " + rabbit.noOfLegs + 
                          " legs.");
       System.out.println(rabbit.getName() + " color is " + rabbit.getColor()); 
    }
    
}
