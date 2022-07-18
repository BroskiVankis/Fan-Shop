package com.example.fanshop.model.dto.offer;

import com.example.fanshop.model.enums.CategoryEnum;
import com.example.fanshop.model.enums.BrandEnum;

import java.math.BigDecimal;

public class OfferDetailDTO {

    private BigDecimal price;

    private Integer year;

    private String description;

    private BrandEnum brand;

    private String imageUrl;

    private CategoryEnum category;

    public OfferDetailDTO() {
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferDetailDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public OfferDetailDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferDetailDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public BrandEnum getBrand() {
        return brand;
    }

    public OfferDetailDTO setBrand(BrandEnum brand) {
        this.brand = brand;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferDetailDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public OfferDetailDTO setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }


    public String getOfferHighlight() {
        return this.year + " " + this.brand + " " + this.category;
    }
}
