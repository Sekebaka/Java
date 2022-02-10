public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("europejski",4.0);
        cat.name = "Lucky";

        Human person = new Human();
        person.firstName = "Paulo";
        person.lastName = "Sousa";
        person.pet = cat;

        cat.feed();
        System.out.println(cat.name + " waży: " + cat.weight);
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();

        System.out.println(cat.name + " waży: " + cat.weight);
    }
}