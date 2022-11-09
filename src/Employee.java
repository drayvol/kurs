public class Employee {
    public static int counter = 0;
    private final String name;
    public int id;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.id = counter++;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id:" + id +
                "; Сотрудник ФИО:" + name  +
                "; Зарплата:" + salary +
                "; Отдел:" + department +
                ';';
    }
}
