import devices.Car;
public class Main {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("europejski",4.0);
        cat.name = "Lucky";

        Car audi = new Car("A3","Audi",10000.0);
        audi.color = "black";
        audi.transmission = "manual";

        Human person = new Human();
        person.firstName = "Paulo";
        person.lastName = "Sousa";
        person.pet = cat;
        person.car = audi;

        person.setSalary(12000.0);
        person.getSalary();

        Car audi2 = new Car("A3","Audi",10000.0);
        audi2.color = "black";
        audi2.transmission = "manual";

        Car mercedes = new Car("E46","BMW",90000.0);
        mercedes.color = "yellow";
        mercedes.transmission = "automatic";

        System.out.println(cat);

        person.setCar(audi);
        if(audi.equals(audi2)) System.out.println("rowne sa");


        //        if(audi.equals(bmw)) System.out.println("nie sa rowne");

        System.out.println(audi);
        System.out.println(audi2);


    }
}