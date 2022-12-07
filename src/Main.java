public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иавнов Иван Иванович", 1, 50_000);
        EMPLOYEES[1] = new Employee("Петров Дмитрий Гаврилович", 2, 40_000);
        EMPLOYEES[2] = new Employee("Сидоров Сергей Петрович", 4, 60_000);
        EMPLOYEES[3] = new Employee("Козлов Константин Семенович", 3, 70_000);
        EMPLOYEES[4] = new Employee("Скворцов Кирилл Александрович", 2, 80_000);
        EMPLOYEES[5] = new Employee("Бубнов Алексей Николаевич", 1, 90_000);
        EMPLOYEES[6] = new Employee("Савинов Денис Степанович", 3, 100_000);

        printFullInfo();
        int totalSalaries = getTotalSalaries();
        System.out.println("Сумма ЗП: " + totalSalaries);
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной ЗП: " + employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной ЗП: " + employeeWithMaxSalary);
        double averageSalary = findAverageSalary();
        System.out.println("Средняя зп: " + averageSalary);
        printFullNaveInfo();
    }

    public static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int getTotalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalaries() / count;
        }
        return 0;
    }

    public static void printFullNaveInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}