import java.util.Objects;

public class Sponsor <T extends Car>{

    private String name;
    private int sumOfSupport;

    public Sponsor(String name, int sumOfSupport) {
        this.name = name;
        this.sumOfSupport = sumOfSupport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumOfSupport() {
        return sumOfSupport;
    }

    public void setSumOfSupport(int sumOfSupport) {
        this.sumOfSupport = sumOfSupport;
    }
    public void sponsorLap(Car car) {
        System.out.println("Спонсор " + name + " спонсирует машину " + car.getBrand() + " " + car.getModel() + " на сумму " + sumOfSupport);
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return sumOfSupport == sponsor.sumOfSupport && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sumOfSupport);
    }
}
