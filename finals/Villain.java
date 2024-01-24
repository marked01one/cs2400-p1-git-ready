public class Villain {
    public String name;
    public int numberOfEvilPlans;

    public Villain(String name, int numberOfEvilPlans) {
        this.name = name;
        this.numberOfEvilPlans = numberOfEvilPlans;
    }

    public Villain(Villain villain) {
        this.name = villain.name;
        this.numberOfEvilPlans = villain.numberOfEvilPlans;
    }

    public boolean equals(Villain otherVillain) {
        return this.name == otherVillain.name &&
            this.numberOfEvilPlans == otherVillain.numberOfEvilPlans;
    } 

    public String toString() {
        return "Name: " + this.name +
            "\nNumber of evil plans: " + this.numberOfEvilPlans;
    }
}
