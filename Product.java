package com.xpanxion.assignments.student.JavaOneII;

public class Product extends Base{
    private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost){
        super(id);
        this.name = name;
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }


    public String getName() {
        return this.name;
    }

}
