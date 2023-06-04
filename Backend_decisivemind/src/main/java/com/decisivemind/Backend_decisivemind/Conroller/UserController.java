package com.decisivemind.Backend_decisivemind.Conroller;


import com.decisivemind.Backend_decisivemind.dto.UserIdentityAvailability;
import com.decisivemind.Backend_decisivemind.dto.UserProfile;
import com.decisivemind.Backend_decisivemind.dto.UserSummary;
import com.decisivemind.Backend_decisivemind.entities.User;
import com.decisivemind.Backend_decisivemind.exception.ResourceNotFoundException;
import com.decisivemind.Backend_decisivemind.repositories.UserRepository;
import com.decisivemind.Backend_decisivemind.security.CurrentUser;
import com.decisivemind.Backend_decisivemind.security.UserPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

//    @Autowired
//    private UserRepository userRepository;
//
//
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
//
//    @GetMapping("/user/me")
//    @PreAuthorize("isAuthenticated()")
//    public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
//        UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(), currentUser.getName());
//        return userSummary;
//    }
//
//    @GetMapping("/user/checkUsernameAvailability")
//    public UserIdentityAvailability checkUsernameAvailability(@RequestParam(value = "username") String username) {
//        Boolean isAvailable = !userRepository.existsByUsername(username);
//        return new UserIdentityAvailability(isAvailable);
//    }
//
//    @GetMapping("/user/checkEmailAvailability")
//    public UserIdentityAvailability checkEmailAvailability(@RequestParam(value = "email") String email) {
//        Boolean isAvailable = !userRepository.existsByEmail(email);
//        return new UserIdentityAvailability(isAvailable);
//    }
//
//    @GetMapping("/users/{username}")
//    public UserProfile getUserProfile(@PathVariable(value = "username") String username) {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
//
//
//        UserProfile userProfile = new UserProfile(user.getId(), user.getUsername(), user.getName(), user.getCreatedAt());
//
//        return userProfile;
//    }



}

