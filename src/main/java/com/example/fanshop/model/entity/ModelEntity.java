package com.example.fanshop.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    private String name;

    private CategoryEnum category;
}
