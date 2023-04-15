package de.nilsauf.codecademy.DiningReviewApi.Repositories;

import de.nilsauf.codecademy.DiningReviewApi.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByName(String name);
}
