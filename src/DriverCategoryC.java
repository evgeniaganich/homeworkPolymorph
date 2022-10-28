public class DriverCategoryC extends Driver<Truck> {

    public DriverCategoryC(String name) {
        super(name);
    }

    @Override
    public void driveCar(Truck car) {
        System.out.println("Водитель " + getName() + " водит машину " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Сажусь в грузовик и начинаю движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливаю грузовик");
    }

    @Override
    public void refillCar() {
        System.out.println("Заправляю грузовик");
    }
}
