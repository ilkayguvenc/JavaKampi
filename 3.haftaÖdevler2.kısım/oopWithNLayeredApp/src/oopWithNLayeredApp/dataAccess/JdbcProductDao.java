package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements IProductDao {
    public void add(Product product){
        System.out.println("JDBC ile veri tabınına eklendi: "+product.getName());
    }


}
