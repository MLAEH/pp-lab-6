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
       

        Manager manager1 = new Manager("Michał", 8500, 4, "17.05.2024", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager1);

        System.out.println(worker1.getName()+" has code:"+worker1.hashCode());
        System.out.println(worker2.getName()+" has code:"+worker2.hashCode());
        System.out.println(worker2.getName()+" has code:"+worker3.hashCode());
        System.out.println(manager1.getName()+" has code:"+manager1.hashCode());

        System.out.println("Porównanie worker2: "+worker2.equals(worker1));
        System.out.println("Porównanie worker2: "+worker2.equals(worker3));
        System.out.println("Porównanie worker2: "+worker2.equals(manager1));
    }
}