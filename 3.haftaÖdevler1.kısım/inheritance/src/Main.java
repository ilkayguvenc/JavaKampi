import business.CustomerManager;
import business.EmployeeManager;
import entities.Customer;
import entities.Employee;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee= new Employee();

        EmployeeManager employeeManager= new EmployeeManager();
        CustomerManager customerManager= new CustomerManager();
        employeeManager.bestEmployee();

    }
}