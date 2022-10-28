public class DriverCategoryD extends Driver<Bus> {

    public DriverCategoryD(String name) {
        super(name);
    }

    @Override
    public void driveCar(Bus car) {
        System.out.println("Водитель " + getName() + " водит машину " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Сажусь в автобус и начинаю движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливаю автобус");
    }

    @Override
    public void refillCar() {
        System.out.println("Заправляю автобус");
    }
}
