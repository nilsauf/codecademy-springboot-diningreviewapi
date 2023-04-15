package de.nilsauf.codecademy.DiningReviewApi.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    private String zipCode;
    private Integer scoreBestRestaurant;
    private Integer scorePeanut;
    private Integer scoreEgg;
    private Integer scoreDairy;
}
