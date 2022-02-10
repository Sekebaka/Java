import devices.Car;
import devices.Phone;
public class Main {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("europejski",4.0);
        cat.name = "Lucky";

        Car audi = new Car("A3","Audi",10000.0, 2015);
        audi.color = "black";
        audi.transmission = "manual";

        Human person = new Human();
        person.firstName = "Paulo";
        person.lastName = "Sousa";
        person.pet = cat;
        person.car = audi;

        person.setSalary(12000.0);
        person.getSalary();

        Car audi2 = new Car("A3","Audi",10000.0, 2015);
        audi2.color = "black";
        audi2.transmission = "manual";

        Car mercedes = new Car("E46","BMW",90000.0, 2019);
        mercedes.color = "yellow";
        mercedes.transmission = "automatic";




        audi.turnOn();
        System.out.println(audi);
        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017);
        phone.turnOn();

        System.out.println(phone);


    }
}