package de.nilsauf.codecademy.DiningReviewApi.Entities;

import lombok.Data;

import javax.persistence.*;

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

    @Enumerated(EnumType.STRING)
    private DiningReviewState state;

    private Integer scorePeanut;

    private Integer scoreEgg;

    private Integer scoreDiary;

    private String comment;

    public enum DiningReviewState {
        Pending,
        Accepted,
        Rejected
    }
}
