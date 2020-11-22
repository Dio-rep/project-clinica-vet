package model;

import modelenum.SaleStatus;

public class Amount {

    private long id_Consumption;
    private long id_Consultation;
    private long id_Product;
    private double amount_Product;
    private double sale_Price;
    private double total_Sale;
    private SaleStatus status;


    public Amount(long id_Consumption, long id_Consultation, long id_Product, double amount_Product, double sale_Price, double total_Sale, SaleStatus status) {
        this.id_Consumption = id_Consumption;
        this.id_Consultation = id_Consultation;
        this.id_Product = id_Product;
        this.amount_Product = amount_Product;
        this.sale_Price = sale_Price;
        this.total_Sale = total_Sale;
        this.status = status;
    }

    public Amount() {
    }

    public long getId_Consumption() {
        return id_Consumption;
    }

    public void setId_Consumption(long id_Consumption) {
        this.id_Consumption = id_Consumption;
    }

    public long getId_Consultation() {
        return id_Consultation;
    }

    public void setId_Consultation(long id_Consultation) {
        this.id_Consultation = id_Consultation;
    }

    public long getId_Product() {
        return id_Product;
    }

    public void setId_Product(long id_Product) {
        this.id_Product = id_Product;
    }

    public double getAmount_Product() {
        return amount_Product;
    }

    public void setAmount_Product(double amount_Product) {
        this.amount_Product = amount_Product;
    }

    public double getSale_Price() {
        return sale_Price;
    }

    public void setSale_Price(double sale_Price) {
        this.sale_Price = sale_Price;
    }

    public double getTotal_Sale() {
        return total_Sale;
    }

    public void setTotal_Sale(double total_Sale) {
        this.total_Sale = total_Sale;
    }

    public SaleStatus getStatus() {
        return status;
    }

    public void setStatus(SaleStatus status) {
        this.status = status;
    }
}
