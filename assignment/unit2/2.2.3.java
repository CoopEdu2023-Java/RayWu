abstract class Employees {
    public abstract int cauculateSalary();
    public abstract void displayInfo();
}

abstract class Manager extends Employees {
    @Override
    public int cauculateSalary() {
        return 10000;
    }
    @Override
    public void displayInfo() {
        System.out.println("Manager");
    }
}

abstract class Programmer extends Employees {
    @Override
    public int cauculateSalary() {
        return 5000;
    }
    @Override
    public void displayInfo() {
        System.out.println("Programmer");
    }
}