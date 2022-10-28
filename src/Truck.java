public class Truck extends Car implements Competing{
    public Truck(String brand, String model, double engineVolume) {
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
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void pitStop() {
        System.out.println("Останавливаемся, проверяем, все ли в порядке с грузовиком, меняем шины, производим ремонт по необходимости");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Грузовик показал лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик развивает максимальную скорость");

    }
}
