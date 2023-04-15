package de.nilsauf.codecademy.DiningReviewApi.Repositories;

import de.nilsauf.codecademy.DiningReviewApi.Entities.DiningReview;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
    List<DiningReview> findAllByRestaurantId(Long restaurantId);
    List<DiningReview> findAllByState(DiningReview.DiningReviewState state);
}
