package com.example.fanshop.model.dto.offer;

import com.example.fanshop.model.enums.CategoryEnum;
import com.example.fanshop.model.enums.SexEnum;

import java.math.BigDecimal;

public class OfferDetailDTO {

    private BigDecimal price;

    private Integer year;

    private String description;

    private SexEnum sex;

    private String imageUrl;

    private CategoryEnum category;

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

    public SexEnum getSex() {
        return sex;
    }

    public OfferDetailDTO setSex(SexEnum sex) {
        this.sex = sex;
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
}
