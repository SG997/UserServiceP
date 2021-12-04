package app.com.repo;

import app.com.dao.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, String> {
    Optional<User> findUserByIsraeliIdNumber(String israeliIdNumber);

}