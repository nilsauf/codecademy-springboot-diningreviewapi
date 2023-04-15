package de.nilsauf.codecademy.DiningReviewApi.Controller;

import de.nilsauf.codecademy.DiningReviewApi.Entities.User;
import de.nilsauf.codecademy.DiningReviewApi.Repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public @ResponseBody User createUser(@RequestBody User newUser){
        boolean userExistsInDatabase = this.userRepository.existsByName(newUser.getName());
        if(userExistsInDatabase)
            throw new IllegalArgumentException();

        return this.userRepository.save(newUser);
    }

}
