package com.jairius.users;
import java.util.List;
import org.springframework.web.bind.annotation.*;

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
    
  @GetMapping("/{userID}") //gets a user by their ID
    public User getUserById(@PathVariable Long userID) {
        return userService.getUserById(userID);
    }

    
    @PostMapping("/createUser")
    public User createUser(@RequestBody User User) { 
        return userService.createUser(User);
    }
    
    @DeleteMapping("/{userID}") //deletes a user by their ID
    public void deleteUser(@PathVariable Long userID) {
        userService.deleteUser(userID);
    }
    
    @PutMapping("/{id}") // updates a user by their ID
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
    
}
