public class Main {
    public static void main(String[] args) {
        Bus liaz = new Bus("ЛиАЗ", "697", 3.0);
        Bus ikarus = new Bus("Ikarus", "280", 2.5);
        Bus volkswagen = new Bus("Volkswagen", "Microbus", 2.8);
        Bus krupp = new Bus("Krupp", "Titan", 1.9);

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7);
        PassengerCar audi = new PassengerCar("Audi","A8 50 L TDI quattro", 3.0);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Avante", 1.6);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4);

        Truck kamaz = new Truck("КамАЗ", "4326", 3.3);
        Truck mercedes = new Truck("Mercedes-Benz", "Actros", 2.9);
        Truck gaz = new Truck("ГАЗ", "3934 СИАМ", 3.0);
        Truck ural = new Truck("Урал", "375", 3.2);

        System.out.println(liaz);
        System.out.println(lada);
        System.out.println(kamaz);
        audi.startMoving();

        audi.pitStop();
        audi.bestLapTime();
        audi.maxSpeed();

        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();

        liaz.pitStop();
        liaz.bestLapTime();
        liaz.maxSpeed();

        DriverCategoryB alexander = new DriverCategoryB("Петров Александр Анатольевич");
        DriverCategoryD maxim = new DriverCategoryD("Иванов Максим Алексеевич");
        DriverCategoryC haruki = new DriverCategoryC("Харуки Мураками");

        alexander.driveCar(audi);
        maxim.driveCar(liaz);
        haruki.driveCar(kamaz);
    }

}