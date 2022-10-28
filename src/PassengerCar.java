public class PassengerCar extends Car implements Competing{
    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Старт!");
    }

    @Override
    public void stopMoving() {
        System.out.println("Финиш!");

    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Останавливаемся, проверяем, все ли в порядке с легковой машиной, меняем шины, производим ремонт по необходимости");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Легковая машина показала лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Легковая ашина развивает максимальную скорость");

    }
}
