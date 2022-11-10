public abstract class Driver<T extends Car> {
    private String name;
    private boolean hasDriverLicense;
    private int experience;

    private T driverCategory;

    public Driver(String name, boolean hasDriverLicense, int experience) {
        this.name = ValidationUtils.validOrDefault(name, "default");
        this.hasDriverLicense = hasDriverLicense;
        this.experience = ValidationUtils.validOrDefault(experience, 2);
    }

    public Driver(String name) {
        this.name = ValidationUtils.validOrDefault(name, "default");
    }

    public Driver(String name, boolean hasDriverLicense, int experience, T driverCategory) {
        this.name = ValidationUtils.validOrDefault(name, "default");
        this.hasDriverLicense = hasDriverLicense;
        this.experience = ValidationUtils.validOrDefault(experience, 2);
        setDriverCategory(driverCategory);

    }

    public abstract void driveCar(T car);

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refillCar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "default");
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = ValidationUtils.validOrDefault(experience, 2);
    }

    public T getDriverCategory() {
        return driverCategory;
    }

    public void setDriverCategory(T driverCategory) {
        if (getDriverCategory() == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.driverCategory = driverCategory;
    }

    @Override
    public String toString() {
        return name;
    }
}
