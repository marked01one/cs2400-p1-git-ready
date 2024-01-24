public class CrazyVillain extends Villain {
    public String crazyLaughter;
    public String crazyIdea;

    public CrazyVillain(String name, int numberOfEvilPlans, String crazyLaughter, String crazyIdea) {
        super(name, numberOfEvilPlans);
        this.crazyLaughter = crazyLaughter;
        this.crazyIdea = crazyIdea;
    }
    
    public String toString(int i) {
        return "Name: " + this.name +
            "\nNumber of evil plans: " + this.numberOfEvilPlans +
            "\nCrazy laughter: " + this.crazyLaughter +
            "\nCrazy idea: " + this.crazyIdea;
    }
}
