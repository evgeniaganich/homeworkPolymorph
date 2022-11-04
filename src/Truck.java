public class Truck extends Car implements Competing{

    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printCarType() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String to = loadCapacity.getTo() == null ? "" : " тонн до " + loadCapacity.getTo() + " тонн";
            System.out.println("Грузоподъемность: от " + loadCapacity.getFrom() + to);
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }
}
