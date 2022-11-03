public class PassengerCar extends Car implements Competing{

    private TypeOfBody typeOfBody;
    public PassengerCar(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void printCarType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова: " + typeOfBody);
        }
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        System.out.println("Легковая машина развивает максимальную скорость");

    }
}
