public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванова Дарья Алексеевна", 1, 40000);
        employees[1] = new Employee("Измайлов Максим Андреевич", 2, 175000);
        employees[2] = new Employee("Кырнац Людмила Вячеславовна", 3, 79000);
        employees[3] = new Employee("Анфалова Елена Романовна", 2, 63000);
        employees[4] = new Employee("Рагозин Сергей Анатольевич", 1, 59000);
        employees[5] = new Employee("Овчинников Андрей Федорович", 3, 46000);
        employees[6] = new Employee("Дрягин Павел Сергеевич", 4, 220000);
        employees[7] = new Employee("Никитин Владислав Александрович", 4, 193000);
        employees[8] = new Employee("Шатрова Ирина Владимировна", 5, 105000);
        employees[9] = new Employee("Исаев Александр Николаевич", 5, 128000);

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("Сумма всех зарплат: " + calculateSumsalary() + " рублей");

        Employee employeeWithMaxSalary = employeeWitMaxSalary();
        if(employeeWithMaxSalary == null){
            System.out.println("Нет сотрудника с высокой зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: " + employeeWitMaxSalary());
        }

        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary());
    }

    public static int calculateSumsalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee employeeWitMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee employeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
}