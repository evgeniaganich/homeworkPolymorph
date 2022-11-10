public class Bus extends Car implements Competing {

    private Capacity capacity;
    private Sponsor sponsor;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }
    public Bus(String brand, String model, double engineVolume, Capacity capacity, Sponsor sponsor) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
        this.sponsor = sponsor;
    }

    @Override
    public void printCarType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " мест до " + capacity.getTo() + " мест");
        }
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
        System.out.println("Останавливаемся, проверяем, все ли в порядке с автобусом, меняем шины, производим ремонт по необходимости");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус показал лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус развивает максимальную скорость");

    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getModel() + " " + getBrand() + " диагностика не требуется");
        return true;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
}
