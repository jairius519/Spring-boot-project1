package com.jairius.users;
import java.util.List;
import org.springframework.stereotype.Service;

//The Service layers handles business logic 
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

   public User getUserById(Long userID) {
    return userRepository.findById(userID).orElse(null);
    }

    
    public User createUser(User user) {
        if(user.getAge() < 18) {
            throw new RuntimeException( "User must be 18 or older");
        }
        return userRepository.save(user);
    }

    
}
    