package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
    
    private String sellerName;
    private Double sum;
    
    
    public SaleSumDTO(Seller seller, Double sum) {
        this.setSellerName(seller.getName());
        this.setSum(sum);
    }
    public SaleSumDTO(){
    }
    public String getSellerName() {
        return sellerName;
    }
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    public Double getSum() {
        return sum;
    }
    public void setSum(Double sum) {
        this.sum = sum;
    }
}
