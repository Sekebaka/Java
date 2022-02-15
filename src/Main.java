import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.FarmAnimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal dog = new Pet("Owczarek",5.0,"Roman");
        FarmAnimal cow = new FarmAnimal("Łaciata",150.0,"Magda");

        cow.beEaten();
        cow.feed();
        dog.takeForAWalk();
        dog.feed(10.0);
        System.out.println("Waga psa: " + dog.weight);
        System.out.println("Waga krowy: " + cow.weight);

        Car audi = new Car("A3","Audi",10000.0, 2015);
        audi.color = "black";
        audi.transmission = "manual";

        Human person = new Human();
        person.firstName = "Paulo";
        person.lastName = "Sousa";
        person.pet = dog;
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




        System.out.println("Zwierze person1: " + person.pet);
        System.out.println("Zwierze person2: " + person2.pet);
        System.out.println("Kasa person1: " + person.cash);
        System.out.println("Kasa person2: " + person2.cash);






    }
}