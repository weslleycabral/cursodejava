package org.example.entity;import java.util.Scanner;public class Product {    private String name;    private double price;    private int stock;    public Product() {        Scanner sc = new Scanner(System.in);        System.out.println("Qual o nome do seu produto?");        setName(sc.nextLine());        System.out.println("Qual o valor do seu produto?");        setPrice(sc.nextDouble());        System.out.println("Quanto você tem em estoque?");        setStock(sc.nextInt());    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public double getPrice() {        return price;    }    public void setPrice(double price) {        this.price = price;    }    public int getStock() {        return stock;    }    public void setStock(int stock) {        this.stock = stock;    }    public void stockTotal() {        System.out.printf("Product data: %s, $%.2f, %d units, Total: $%.2f%n", getName(),                getPrice(), getStock(), getStock() * getPrice());    }    public void AddProducts(int n) {        setStock(getStock() + n);        stockTotal();    }    public void RemoveProducts(int n) {        setStock(getStock() - n);        stockTotal();    }}