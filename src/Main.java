import com.company.devices.Car;
import com.company.devices.Phone;
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


        Human person2 = new Human();
        person2.firstName = "Andrzej";
        person2.lastName = "Andrzejewicz";



        Car mercedes = new Car("E46","BMW",90000.0, 2019);
        mercedes.color = "yellow";
        mercedes.transmission = "automatic";

        person.setSalary(10000.0);
        person.getSalary();
        person.setCar(audi);



        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017);
        person.mobilePhone = phone;

        person.mobilePhone.sell(person,person2,300.0);

        cat.sell(person,person2,200.0);
        System.out.println("Zwierze person1: " + person.pet);
        System.out.println("Zwierze person2: " + person2.pet);
        System.out.println("Kasa person1: " + person.cash);
        System.out.println("Kasa person2: " + person2.cash);

        person.sell(person,person2,10.0);




    }
}