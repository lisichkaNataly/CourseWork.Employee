public class Employee {
    private String FIO;
    private int department;
    private int salary;
    private static int Counter;
    private int id;


    public Employee (String fio, int department, int salary) {
        this.FIO = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++Counter;
    }

    public int getId() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " ID: " + id + " ФИО: " + FIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
