package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO {
    
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO(){
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
        this.setId(id);
        this.setVisited(visited);
        this.setDeals(deals);
        this.setAmount(amount);
        this.setDate(date);
        this.setSeller(seller);
    }

    public SaleDTO(Sale entity) {
        setId(entity.getId());
        setVisited(entity.getVisited());
        setDeals(entity.getDeals());
        setAmount(entity.getAmount());
        setDate(entity.getDate());
        setSeller(new SellerDTO(entity.getSeller()));
    }

}
