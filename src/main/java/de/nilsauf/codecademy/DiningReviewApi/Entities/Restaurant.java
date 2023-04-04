package de.nilsauf.codecademy.DiningReviewApi.Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    private Integer scoreBestRestaurant;
    private Integer scorePeanut;
    private Integer scoreEgg;
    private Integer scoreDairy;
}
