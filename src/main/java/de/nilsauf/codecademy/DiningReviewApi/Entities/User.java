package de.nilsauf.codecademy.DiningReviewApi.Entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue()
    private Long Id;

    @Column(unique = true, nullable = false)
    private String name;
    private String city;
    private String state;
    private String zipcode;
    private boolean peanutAllergy;
    private boolean eggAllergy;
    private boolean diaryAllergy;
}
