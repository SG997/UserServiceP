package app.com.controller;

import app.com.dao.UserType;
import app.com.services.UserServices;
import app.com.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@RestController
public class UserServiceController {

    @Autowired
    UserServices userServices;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userServices.createNewUser(user);
    }

    @PutMapping("/setUserType")
    public User changeUserType(@RequestParam String id, @RequestParam UserType userType){
        return this.userServices.setUserType(id, userType);
    }
}
