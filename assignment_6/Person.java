// Minh Khoi Tran
// CS 1400
// Assignment 6
// 12-07-2023
public class Person {
    private String name;
    private int age;
    private String favoriteFood;

    public String getName() { return this.name; }
    public void setName(String newName) { this.name = newName; }

    public int getAge() { return this.age; }
    public void setAge(int newAge) { this.age = newAge; }

    public String getFavoriteFood() { return this.favoriteFood; }
    public void setFavoriteFood(String newFavoriteFood) { this.favoriteFood = newFavoriteFood; }

    public Person(String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.favoriteFood = person.favoriteFood;
    }

    public boolean equals(Person other) {
        return 
            this.name == other.getName() && 
            this.age == other.getAge() &&
            this.favoriteFood == other.getFavoriteFood(); 
    }

    public String toString() {
        return 
            "\nName: " + this.name + 
            "\nAge: " + this.age + 
            "\nFavorite food: " + this.favoriteFood + "\n";
    }
}
