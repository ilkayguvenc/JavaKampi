public class Product {
    public Product(){}
    public Product (int id, String name, String description, int price, String renk,  String kod, int stockAmount){
       this. id =id;
       this.name=name;
       this. description=description;
       this.price=price;
       this.renk=renk;
       this.kod=kod;
       this.stockAmount=stockAmount;
        System.out.println("Yapıcı blok çalıştı.");
    }
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}
