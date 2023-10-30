package com.xpanxion.assignments.student.JavaOneII;
import java.util.*;
public class Invoice extends Base {
    private List<Product> products;

    public Invoice(int id){
        super(id);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public double getProductCost(Product product){
        return product.getCost();
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Product product : this.products) {
            total += product.getCost();
        }
        return total;
    }
}
