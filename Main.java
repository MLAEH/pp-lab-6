import company.abstracts.Employee;
import company.interfaces.Employable;
import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Robert", 4000, 1, "17.05.2024", "Worker");
        Worker worker2 = new Worker("Piotr", 4500, 1, "17.05.2024", "Worker");
        Worker worker3 = new Worker("Kacper", 3500, 3, "17.05.2024", "Worker");
        Worker worker4 = new Worker("Racper", 3500, 4, "17.05.2024", "Worker");
        Worker worker5 = new Worker("Pacper", 4500, 5, "17.05.2024", "Worker");
        Manager manager1 = new Manager("Michał", 8500, 4, "17.05.2024", "Manager");
        Manager manager2 = new Manager("Michael", 8500, 5, "17.05.2024", "Manager");
        Manager manager3 = new Manager("M", 8500, 5, "17.05.2024", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);
        
        double sumaPensji=0;
        for (Employee employee : employees) {
            sumaPensji=sumaPensji+employee.getSalary();
        }
        System.out.println("Suma pensji wyniosi:"+sumaPensji);
        double sumaPensjiManager=0,sumaPensjiWorker=0;
        for (Employee employee : employees) {
            if(employee instanceof Manager) {
                sumaPensjiManager=sumaPensjiManager+employee.getSalary();
            }
            if(employee instanceof Worker) {
                sumaPensjiWorker=sumaPensjiWorker+employee.getSalary();
            }
        }
        System.out.println("Suma pensji menadzerow:"+sumaPensjiManager);
        System.out.println("Suma pensji menadzerow:"+sumaPensjiWorker);
    }
}