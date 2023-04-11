package de.nilsauf.codecademy.DiningReviewApi.Repositories;

import de.nilsauf.codecademy.DiningReviewApi.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByName(String name);
}
