package de.nilsauf.codecademy.DiningReviewApi.Entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class DiningReview {
    @Id
    @GeneratedValue()
    private Long Id;

    @Column(unique = true, nullable = false)
    private String submitter;

    @Column(nullable = false)
    private Long restaurantId;

    private Integer scorePeanut;

    private Integer scoreEgg;

    private Integer scoreDiary;

    private String comment;

}
