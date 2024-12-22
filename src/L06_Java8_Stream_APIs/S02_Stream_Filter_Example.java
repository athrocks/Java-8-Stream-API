package L06_Java8_Stream_APIs;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S02_Stream_Filter_Example {
    public static void main(String[] args) {

        // filter products with price more than 5000

        // Traditionally
        List<Product> productList = new ArrayList<>();

        List<Product> products = getProducts();

        for (Product product : products) {
            if (product.getPrice() > 5000){
                productList.add(product);
            }
        }
        for (Product product : productList) {
            System.out.println(product);
        }

        System.out.println("************************");

        // Using Filter Method
//        Stream<Product> productMoreThan5000= products.stream().filter(prd -> prd.getPrice() > 5000);
//        productMoreThan5000.forEach(prd -> System.out.println(prd));

        products.stream()
                .filter(prd -> prd.getPrice() > 5000)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"HP",4000));
        products.add(new Product(2,"Dell",5000));
        products.add(new Product(3,"Asus",6000));
        products.add(new Product(4,"Mac Book",7000));

        return products;
    }
}

class Product{

    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}