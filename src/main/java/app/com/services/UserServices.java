package app.com.services;

import app.com.dao.UserType;
import app.com.dao.User;
import app.com.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServices {

    @Autowired
    UserRepo userRepo;


    public User createNewUser(User user){

        return this.userRepo.save(new User(user.getName(), user.getLastName(), user.getIsraeliIdNumber(), user.getDateOfBirth(), user.getMail(), user.getPreFix(), user.getSuffix(), user.getPassword(), user.getUserType()));
    }

    public User setUserType(String id, UserType userType){
        Optional<User> user = this.userRepo.findUserByIsraeliIdNumber(id);
        user.get().setUserType(userType);

        return this.userRepo.save(user.get());
    }
}
