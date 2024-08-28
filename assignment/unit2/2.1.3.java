class Employee{
    private String id;
    private String name;
    private double salary = 5.0;

    public static String getter() {
        double salary = 5.0;
        return String.format("%.2f", salary);
    }

    public static void main(String[] args) {
        System.out.println(Employee.getter());
    }
}