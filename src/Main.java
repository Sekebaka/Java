public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("europejski",4.0);
        cat.name = "Lucky";

        Car audi = new Car("Audi","A3");
        audi.color = "black";
        audi.transmission = "manual";

        Human person = new Human();
        person.firstName = "Paulo";
        person.lastName = "Sousa";
        person.pet = cat;
        person.car = audi;

        person.setSalary(5000.0);
        person.getSalary();

        person.setSalary(0.0);
        person.getSalary();


    }
}