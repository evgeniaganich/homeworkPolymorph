import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private double engineVolume;

    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.engineVolume = ValidationUtils.validOrDefault(engineVolume, 2.0);

    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }
    public abstract void startMoving();

    public abstract void stopMoving();

    public String getBrand() {
        return brand;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + engineVolume;
    }

    public abstract void printCarType();

    public abstract boolean service();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(drivers, car.drivers) && Objects.equals(mechanics, car.mechanics) && Objects.equals(sponsors, car.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, sponsors);
    }
}
