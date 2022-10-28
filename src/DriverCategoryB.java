public class DriverCategoryB extends Driver<PassengerCar> {

    public DriverCategoryB(String name) {
        super(name);
    }

    @Override
    public void driveCar(PassengerCar car) {
        System.out.println("Водитель " + getName() + " водит машину " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Сажусь в легковую машину и начинаю движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливаю легковую машину");
    }

    @Override
    public void refillCar() {
        System.out.println("Заправляю легковую машину");
    }
}
