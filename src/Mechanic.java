import java.util.ArrayList;

public class Mechanic<T extends Car> {
    private String name;
    private String lastName;
    private String company;
    private ArrayList<Car> cars = new ArrayList<>();

    public Mechanic(String name, String lastName, String company) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
    }

    public Mechanic(String name, String lastName, String company, ArrayList<Car> cars) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
        this.cars = cars;
    }

    public void maintenance(Car car) {
        System.out.println("Механик " + name + " " + lastName + " проводит техобслуживание автомобиля " + car.getBrand() + car.getModel());
    }
    public void fixCar(Car car) {
        System.out.println("Механик " + name + " " + lastName + " чинит автомобиль " + car.getBrand() + car.getModel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " из компании " + company;
    }
}
