package streamNDB;


import java.util.*;

class Product {

    int id;
    String name;
    double price;
    String category;
    double rating;

    Product(int id, String name,
            double price,
            String category,
            double rating) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
    }

    public String toString() {

        return id + " " + name + " "
                + price + " "
                + category + " "
                + rating;
    }
}



public class Streams {
	
	 public static void main(String[] args) {

	        List<Product> products =
	            Arrays.asList(

	                new Product(1,"Laptop",55000,
	                            "Electronics",4.5),

	                new Product(2,"Shoes",2500,
	                            "Fashion",4.0),

	                new Product(3,"Mobile",30000,
	                            "Electronics",4.7),

	                new Product(4,"Watch",1500,
	                            "Fashion",3.9),

	                new Product(5,"Headphones",2000,
	                            "Electronics",4.2)
	            );

	        System.out.println(
	            "Products Price > 5000");

	        products.stream()
	                .filter(p -> p.price > 5000)
	                .forEach(System.out::println);

	        System.out.println(
	            "\nSorted By Price");

	        products.stream()
	                .sorted((p1,p2) ->
	                    Double.compare(
	                        p1.price,
	                        p2.price))
	                .forEach(System.out::println);
	    }

}
