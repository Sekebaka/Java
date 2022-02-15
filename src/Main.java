import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;
import java.util.ArrayList;
import java.util.List;

import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal dog = new Pet("Owczarek",5.0,"Roman");
        FarmAnimal cow = new FarmAnimal("Łaciata",150.0,"Magda");
        Human person = new Human("Paulo","Sousa");
        person.pet = dog;

        Human person2 = new Human("Andrzej","Andrzejewicz");

        Car tesla = new Electric("Tesla","1234",2017,80000.0);
        tesla.color = "black";
        tesla.transmission = "manual";





        Car mercedes = new Diesel("Mercedes","C klasa",2012,150000.0);
        mercedes.color = "yellow";
        mercedes.transmission = "automatic";

        Car audi = new LPG("Audi","A4",2003,3000.0);
        audi.transmission = "manual";
        audi.color = "red";

        person.setSalary(1000000.0);
        person.getSalary();


        tesla.refuel();

        person.setCar(tesla,0);
        person.setCar(mercedes,1);
        person.setCar(audi,2);


        System.out.println("Wartość aut to: " + person.getValue());
        System.out.println("Sortowanie: " + person.sortCars());

        tesla.sell(person,person2,1000.0);
        //        person.hasCar(tesla);



        Phone phone = new Phone("Apple","Iphone X",6.2,"IOS",2017,1500.0);
        person.mobilePhone = phone;
        phone.installAnApp("Facebook");
        phone.installAnApp("Facebook", "1.0.1");
        phone.installAnApp("Snapchat", "1.0.2", "snapchat.com");


        String[] appList = {"Facebook","Snapchat","Instagram","Messenger"};
        phone.installAnApp(appList);










    }
}