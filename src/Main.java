public class Main {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("europejski",4.0);
        cat.name = "Lucky";

        Car audi = new Car("Audi","A3");
        audi.color = "black";
        audi.transmission = "manual";
        audi.value = 10000.0;

        Human person = new Human();
        person.firstName = "Paulo";
        person.lastName = "Sousa";
        person.pet = cat;
        person.car = audi;

        person.setSalary(12000.0);
        person.getSalary();

        person.setCar(audi);
        person.getCar();


    }
}