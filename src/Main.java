import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sponsor ivan = new Sponsor<>("Иванов Иван Иванович", 1000);
        Sponsor rich = new Sponsor<>("Rich Bitch LLC", 50000);
        Sponsor james = new Sponsor("James Knight", 7000);
        Sponsor gold = new Sponsor<>("Gold Motors LLC", 10000);

        DriverCategoryB alexander = new DriverCategoryB("Петров Александр Анатольевич");
        DriverCategoryD maxim = new DriverCategoryD("Иванов Максим Алексеевич");
        DriverCategoryC haruki = new DriverCategoryC("Харуки Мураками");

        Mechanic<PassengerCar> petr = new Mechanic<>("Петр", "Петров","ООО Ромашка");
        Mechanic<Truck> sergey = new Mechanic<>("Сергей", "Иванов", "ООО Мотор");
        Mechanic<Bus> svetlana = new Mechanic<>("Светлана", "Иванова", "Girl Power LLC");

        Bus liaz = new Bus("ЛиАЗ", "697", 3.0, Capacity.LARGE);
        liaz.addDriver(maxim);
        liaz.addMechanic(svetlana);
        liaz.addSponsor(gold);

        Bus ikarus = new Bus("Ikarus", "280", 2.5, Capacity.MEDIUM);
        Bus volkswagen = new Bus("Volkswagen", "Microbus", 2.8, Capacity.SMALL);
        Bus krupp = new Bus("Krupp", "Titan", 1.9, Capacity.EXTRA_SMALL);

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7, TypeOfBody.SEDAN);
        lada.addDriver(alexander);
        lada.addMechanic(petr);
        lada.addSponsor(ivan);

        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0, TypeOfBody.HATCHBACK);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Avante", 1.6, TypeOfBody.SEDAN);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, TypeOfBody.COUPE);

        Truck kamaz = new Truck("КамАЗ", "4326", 3.3, LoadCapacity.N1, james);
        kamaz.addDriver(haruki);
        kamaz.addMechanic(sergey);
        kamaz.addSponsor(rich);

        Truck mercedes = new Truck("Mercedes-Benz", "Actros", 2.9, LoadCapacity.N2);
        Truck gaz = new Truck("ГАЗ", "3934 СИАМ", 3.0, LoadCapacity.N3);
        Truck ural = new Truck("Урал", "375", 3.2, LoadCapacity.N1);

        service(
                lada, audi, hyundai, kia,
                kamaz, mercedes, gaz, ural,
                liaz, ikarus, volkswagen, krupp);

        System.out.println(liaz);
        liaz.printCarType();
        System.out.println(lada);
        lada.printCarType();
        System.out.println(kamaz);
        kamaz.printCarType();
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


        alexander.driveCar(audi);
        maxim.driveCar(liaz);
        haruki.driveCar(kamaz);

        System.out.println(petr);


        List<Car> cars = List.of(kia, lada, hyundai, audi,
                kamaz, krupp, mercedes, ural,
                gaz, liaz, ikarus, volkswagen);

        printInfo(lada);
        printInfo(kamaz);
        printInfo(liaz);

        MaintenanceStation maintenanceStation = new MaintenanceStation();
        maintenanceStation.addPassengerCar(lada);
        maintenanceStation.addTruck(kamaz);
        maintenanceStation.service();
        maintenanceStation.service();

    }

    public static void printInfo(Car car) {
        System.out.println("Машину " + car.getBrand() + " " + car.getModel() + " водит водитель " + car.getDrivers()
                + ", ремонтирует механик " + car.getMechanics() + ", поддерживает спонсор: " + car.getSponsors());
    }

    public static void service(Car... cars) {
        for (Car car : cars) {
            serviceCar(car);
        }

    }

    private static void serviceCar(Car car) {
        if (!car.service()) {
            try {
                throw new RuntimeException("Машина " + car.getBrand() + " " + car.getModel() + " не прошла диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Машина " + car.getBrand() + " " + car.getModel() + " успешно прошла диагностику");
        }

    }


}