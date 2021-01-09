package com.foodmin.be.foodminapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dish")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dish implements Serializable {

    @Id
    private Long id;

    @Column(name = "dish_name", columnDefinition = "text")
    private String dishName;
}
