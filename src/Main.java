public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {

        EMPLOYEES[0] = new Employee("Иванова Дарья Алексеевна", 1, 40000);
        EMPLOYEES[1] = new Employee("Измайлов Максим Андреевич", 2, 175000);
        EMPLOYEES[2] = new Employee("Кырнац Людмила Вячеславовна", 3, 79000);
        EMPLOYEES[3] = new Employee("Анфалова Елена Романовна", 2, 63000);
        EMPLOYEES[4] = new Employee("Рагозин Сергей Анатольевич", 1, 59000);
        EMPLOYEES[5] = new Employee("Овчинников Андрей Федорович", 3, 46000);
        EMPLOYEES[6] = new Employee("Дрягин Павел Сергеевич", 4, 220000);
        EMPLOYEES[7] = new Employee("Никитин Владислав Александрович", 4, 193000);
        EMPLOYEES[8] = new Employee("Шатрова Ирина Владимировна", 5, 105000);
        EMPLOYEES[9] = new Employee("Исаев Александр Николаевич", 5, 128000);

        printAllEmployees();
        System.out.println();

        System.out.println("Сумма всех зарплат: " + calculateSumSalary() + " рублей");

        Employee employeeWithMaxSalary = employeeWitMaxSalary();
        if(employeeWithMaxSalary == null){
            System.out.println("Нет сотрудника с высокой зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: " + employeeWitMaxSalary());
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary());
        System.out.println("Средняя зарплата составляет: " + employeesAvgSalary() + " рублей");
        System.out.println();
        System.out.println("Список ФИО сотрудников:");
        printAllFullNameEmployees();


    }

    private static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee employeeWitMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    private static Employee employeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    private static void printAllEmployees(){
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void printAllFullNameEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static double employeesAvgSalary() {
        double avg = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
               avg += employee.getSalary();
            }
            avg /= EMPLOYEES.length;
        }
        return avg;
    }
}