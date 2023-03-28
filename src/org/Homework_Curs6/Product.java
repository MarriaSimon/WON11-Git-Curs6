package org.Homework_Curs6;

class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productCategory;

    public Product(String productName, double productPrice, int productQuantity, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public boolean hasStock() {
        if (productQuantity > 0) return true;
        else return false;
    }

    public boolean isCategory(String productCategory) {
        return this.productCategory.equals(productCategory);
    }
}
