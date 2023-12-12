public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "mouse";
        product.id=1;
        product.price=29;

        ProductManager productManager= new ProductManager();
        productManager.add(product);

    }
}