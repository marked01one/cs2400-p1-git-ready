// Minh Khoi Tran
// CS 1400
// Assignment 6
// 12-07-2023
public class Demo {
    public static void main(String[] args) {
        // Instantiate two Person and two Superhero objects
        Person person1 = new Person("John", 25, "Pizza");
        Person person2 = new Person("Jane", 30, "Sushi");

        SuperHero superhero1 = new SuperHero(person1, "Captain Marvel", "Flight", "Higher, further, faster!");
        SuperHero superhero2 = new SuperHero(person2, "Spider-Man", "Web-slinging", "Friendly neighborhood Spider-Man");

        // Use methods except the getter and setter methods
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(superhero1.toString());
        System.out.println(superhero2.toString());

        // Use static method
        System.out.println("Total number of villains caught: " + SuperHero.villainsCaught());

        // Catch a villain
        SuperHero.catchVillain();
        System.out.println("Total number of villains caught after catching one: " + SuperHero.villainsCaught());
    }
}
