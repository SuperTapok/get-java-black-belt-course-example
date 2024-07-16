package org.example;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    int id;
    float salary;
    String name;

    public Employee (int id, float salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    /**
     * Метод, используемый для сравнения объектов.
     *
     * @param anotherEmp the object to be compared.
     * @return Число больше нуля, если данный объект больше передаваемого. Ноль, если одинаковые.
     * Меньше нуля, если переданный объект больше.
     */
    @Override
    public int compareTo(Employee anotherEmp){
        // Интересное применение математики. Я бы так сразу и не придумал)
        return this.id - anotherEmp.id;
    }

    @Override
    public String toString() {
        return "Employee - %s, %s, %s".formatted(this.id, this.name, this.salary);
    }
}

class NameComparator implements Comparator<Employee> {
    /**
     * Переопределённый метод compare для сравнения строк
     *
     * @param emp1 the first object to be compared.
     * @param emp2 the second object to be compared.
     * @return Число сравнения
     */
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
