package Homework_Curs6;

public class ProductApplication {
    public static void main(String[] args) {
        Product product1 = new Product("berries", 1.32, 5, "fruits");
        Product product2 = new Product("laptop", 25689.72, 0, "equipment");
        Product product3 = new Product("orchid", 10.99, 12, "flowers");

        System.out.println("Product name: " + product1.getProductName() + " Price: " + product1.getProductPrice() + " Quantity: " + product1.getProductQuantity() + " Category: " + product1.getProductCategory());
        System.out.println("Has stock available: " + product1.hasStock());
        System.out.println("Is correct category? True/False: " + String.valueOf(product1.isCategory("fruit")));

        System.out.println("\nProduct name: " + product2.getProductName() + " Price: " + product2.getProductPrice() + " Quantity: " + product2.getProductQuantity() + " Category: " + product2.getProductCategory());
        System.out.println("Has stock available: " + product2.hasStock());
        System.out.println("Is correct category?: " + String.valueOf(product2.isCategory("equipment")));

        System.out.println("\nProduct name: " + product3.getProductName() + " Price: " + product3.getProductPrice() + " Quantity: " + product3.getProductQuantity() + " Category: " + product3.getProductCategory());
        System.out.println("Has stock available: " + product3.hasStock());
        System.out.println("Is correct category?: " + String.valueOf(product3.isCategory("flowers")));
    }
}
