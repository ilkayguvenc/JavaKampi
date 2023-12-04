// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"laptop","monster laptop", 4599, "sarı","m1234",5);

//        Product product = new Product();
//        product.setName("laptop");
//        product.setStockAmount(5);
//        product.setId(1);
//        product.setPrice(4699);
//        product.setDescription("monster laptop");

        System.out.println(product.getName());
        System.out.println(product.getId());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());

        ProductManager productManager = new ProductManager();
        productManager.ekle(product);

    }
}