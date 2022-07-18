package com.example.fanshop.model.dto.offer;

import com.example.fanshop.model.enums.CategoryEnum;
import com.example.fanshop.model.enums.BrandEnum;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class AddOfferDTO {

    @NotNull
    @Min(1)
    private Long modelId;

    @NotNull
    private CategoryEnum category;

    @Positive
    @NotNull
    private Integer price;

    @Min(1995)
    @NotNull
    private Integer year;

    @NotEmpty
    private String description;

    @NotNull
    private BrandEnum brand;

    @NotEmpty
    private String imageUrl;

    public Long getModelId() {
        return modelId;
    }

    public AddOfferDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public AddOfferDTO setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public AddOfferDTO setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public AddOfferDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddOfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public BrandEnum getBrand() {
        return brand;
    }

    public AddOfferDTO setBrand(BrandEnum brand) {
        this.brand = brand;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AddOfferDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
