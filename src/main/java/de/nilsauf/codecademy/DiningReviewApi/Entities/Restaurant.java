package de.nilsauf.codecademy.DiningReviewApi.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

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
