public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Müşteri MySQL ile getirildi.");
    }
}
