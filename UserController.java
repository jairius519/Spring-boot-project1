package com.jairius.users;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users") //Base URL for all endpoints in this controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("{userID}")
    public User getUserById(Long userID) {
        return userService.getUserById(userID);
    }

    
    @PostMapping("/createUser")
    public User createUser(@RequestBody User User) { 
        return userService.createUser(User);
    }
    
}