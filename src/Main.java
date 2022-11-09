public class Main {
    public static Employee[] employees = new Employee[10];
    public static void printEmployees(){
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }
    public static int getTotalSalary(){
        int sum=0;
        for (Employee employee:employees) {
            sum+=employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeWithMinSalary(){
        Employee result = employees[0];
        int min = employees[0].getSalary();
        for (Employee employee:employees) {
            if(employee!=null && min > employee.getSalary()){
                min = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];
        int max = employees[0].getSalary();
        for (Employee employee:employees) {
            if(employee!=null && max < employee.getSalary()){
                max = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float getAverageSalary(){
        return getTotalSalary()/(float) Employee.getCounter();
    }
    public static void printNames(){
        for (Employee employee:employees) {
            if(employee!=null) System.out.println(employee.getName());
        }
    }
    public static void increaseSalary(int percent){
        for (Employee employee:employees) {
            employee.setSalary((int) (employee.getSalary()*(1+percent/100f)));
        }
    }
    public static Employee findMinSalaryOfDep(int department){
        int min = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee:employees) {
            if(employee.getDepartment()==department){
                if (min > employee.getSalary()){
                    min = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }
    public static Employee findMaxSalaryOfDep(int department){
        int max = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee:employees) {
            if(employee.getDepartment()==department){
                if (max < employee.getSalary()){
                    max = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }
    public static int getTotalSalaryOfDep(int department){
        int sum=0;
        for (Employee employee:employees) {
            if(employee.getDepartment()==department) sum+=employee.getSalary();
        }
        return sum;
    }
    public static void increaseSalaryOfDep(int percent, int department){
        for (Employee employee:employees) {
            if(employee.getDepartment()==department) employee.setSalary((int) (employee.getSalary()*(1+percent/100f)));
        }
    }
    public static float getAverageSalaryOfDep(int department){
        int sum=0;
        int peopleCounter = 0;
        for (Employee employee:employees) {
            if(employee.getDepartment()==department) {
                sum+=employee.getSalary();
                peopleCounter++;
            }
        }
        return sum/(float) peopleCounter;
    }
    public static void printDep(int department){
        for (Employee employee:employees) {
            if (employee.getDepartment() == department) System.out.println(employee.getId() + ", " + employee.getName() + ", зарпалата: "+employee.getSalary());
        }
    }
    public static void printEmployeesWithBiggerSalary(int salary){
        for (Employee employee:employees) {
            if (employee.getSalary() >= salary) System.out.println(employee.getId() + ", " + employee.getName() + ", зарпалата: "+employee.getSalary());
        }
    }
    public static void printEmployeesWithSmallerSalary(int salary){
        for (Employee employee:employees) {
            if (employee.getSalary() < salary) System.out.println(employee.getId() + ", " + employee.getName() + ", зарпалата: "+employee.getSalary());
        }
    }
    public static void main(String[] args){
        employees = new Employee[]{
                new Employee("Адам Евович", 120000, 1),
                new Employee("Иссус Христович", 135000, 1),
                new Employee("Оппенгеймер Роберт",150000,  2),
                new Employee("Нейман Джон",180000,2),
                new Employee("Фейнман Ричард", 130000,2),
                new Employee("Эйнштейн Альберт",1000_000,  3),
                new Employee("Тамм Игорь Евгеньевич", 78000, 4),
                new Employee("Александр Пушкин", 79000, 5),
                new Employee("Александр Лебедев", 340000, 5),
                new Employee("Максим Эйлер", 34000, 1)};
        printEmployees();
        printNames();
        System.out.println(findEmployeeWithMinSalary());
        System.out.println(getTotalSalary());
        System.out.println(getAverageSalary());
        increaseSalary(10);
        System.out.println(getTotalSalary());
        printDep(1);
        printEmployeesWithBiggerSalary(38000);
        System.out.println(getAverageSalaryOfDep(5));
    }
}
