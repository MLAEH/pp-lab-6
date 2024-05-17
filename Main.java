import company.abstracts.Employee;
import company.interfaces.Employable;
import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Robert", 4000, 1, "17.05.2024", "Worker");
        Worker worker2 = new Worker("Piotr", 4500, 2, "17.05.2024", "Worker");
        Worker worker3 = new Worker("Kacper", 3500, 3, "17.05.2024", "Worker");
        Worker worker4 = new Worker("Marcin", 3800, 4, "17.05.2024", "Worker");

        Manager manager1 = new Manager("Michał", 8500, 5, "17.05.2024", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("-"+employee.getName()+ " (ID:"+ employee.hashCode()+") Position: "+ employee.getPosition()+" Hire date:"+employee.getHireDate()+" Salary:"+employee.getSalary());
        }
    }
}