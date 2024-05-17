import company.abstracts.Employee;
import company.interfaces.Employable;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Robert", 4000, 1);
        Worker worker2 = new Worker("Piotr", 4500, 2);
        Worker worker3 = new Worker("Kacper", 3500, 3);
        Worker worker4 = new Worker("Marcin", 3800, 4);

        Manager manager1 = new Manager("Michał", 8500, 5);

        System.out.println(manager1.getName()+" salary: "+manager1.getSalary());
        manager1.work();
        System.out.println(worker1.getName()+" salary: "+worker1.getSalary());
        worker1.work();
        System.out.println(worker2.getName()+" salary: "+worker2.getSalary());
        worker2.work();
        System.out.println(worker3.getName()+" salary: "+worker3.getSalary());
        worker3.work();
        System.out.println(worker4.getName()+" salary: "+worker4.getSalary());
        worker4.work();
    }
}