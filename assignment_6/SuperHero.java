// Minh Khoi Tran
// CS 1400
// Assignment 6
// 12-07-2023
public class SuperHero extends Person {
    private String superHeroName;
    public String getSuperHeroName() { return superHeroName; }
    public void setSuperHeroName(String superHeroName) { this.superHeroName = superHeroName; }

    private String superPower;
    public String getSuperPower() { return superPower; }
    public void setSuperPower(String superPower) { this.superPower = superPower; }

    private String catchphrase;
    public String getCatchphrase() { return catchphrase; }
    public void setCatchphrase(String catchphrase) { this.catchphrase = catchphrase; }

    public SuperHero(String name, int age, String favoriteFood, String superHeroName, String superPower, String catchphrase) {
        super(superHeroName, age, favoriteFood);
        this.superHeroName = superHeroName;
        this.superPower = superPower;
        this.catchphrase = catchphrase;
    }

    public SuperHero(Person person, String superHeroName, String superPower, String catchphrase) {
        super(person);
        this.superHeroName = superHeroName;
        this.superPower = superPower;
        this.catchphrase = catchphrase;
    }

    public SuperHero(SuperHero superHero) {
        super(superHero.getName(), superHero.getAge(), superHero.getFavoriteFood());
        this.superHeroName = superHero.getSuperHeroName();
        this.superPower = superHero.getSuperPower();
        this.catchphrase = superHero.getCatchphrase();
    }

    public String toString() {
        return 
            "\nName: " + this.getName() +
            "\nAge: " + this.getAge() +
            "\nFavorite food: " + this.getFavoriteFood() +
            "\nSuperhero name: " + this.getSuperHeroName() +
            "\nSuperpower: " + this.getSuperPower() +
            "\nCatchphrase: " + this.getCatchphrase() + "\n";
    }
    
    private static int totalNumberVillainsCaught = 0;
    public static int villainsCaught() { return totalNumberVillainsCaught; }
    public static void catchVillain() { totalNumberVillainsCaught += 1; }
}
