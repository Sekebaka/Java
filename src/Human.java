import com.company.devices.Car;
import com.company.devices.Phone;

public class Human implements Salleable {
    public Animal pet;
    public String firstName;
    public String lastName;
    public Phone mobilePhone;
    private Car car;
    private Double salary;
    public Double cash;

    public Double getSalary() {
        System.out.println("Wartość wypłaty: " + this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) throws Exception {
        if (salary <= 0) throw new Exception();
        System.out.println("" + firstName + " " + lastName + ": " + salary);
        System.out.println("Dane zostały wysłane do systemu księgowego.");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą, nie ma sensu ukrywać dochodu.");
        this.salary = salary;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("Kupiony za gotówkę");
            this.car = car;
        } else if (car == null) {
            System.out.println("Samochód niedostępny");
            this.car = car;
        } else if (this.salary > (car.value / 12)) {
            System.out.println("Wzięty na kredyt");
            this.car = car;
        } else
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }
    public String toString() {
        return firstName+" "+lastName+" "+ pet +" "+ salary+" "+mobilePhone+" "+car+" "+cash;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Handel ludźmi jest niedozwolony!!!");
    }
}