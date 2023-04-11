package de.nilsauf.codecademy.DiningReviewApi.Repositories;

import de.nilsauf.codecademy.DiningReviewApi.Entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    Optional<Restaurant> findByNameAndZipCode(String name, String zipCode);
}
