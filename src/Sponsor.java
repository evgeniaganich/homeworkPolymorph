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
}
