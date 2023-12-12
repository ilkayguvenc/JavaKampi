public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager= new MySqlManager();
        customerManager.getCustomers();

    }
}