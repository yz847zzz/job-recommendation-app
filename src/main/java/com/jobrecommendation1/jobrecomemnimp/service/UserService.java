package com.jobrecommendation1.jobrecomemnimp.service;

import com.jobrecommendation1.jobrecomemnimp.model.User;
import com.jobrecommendation1.jobrecomemnimp.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public Optional<User> authenticate(String username, String rawPassword) {
        System.out.println("🔍 Attempting login for username: " + username);

        Optional<User> user = userRepository.findByUsername(username);
        if (user.isEmpty()) {
            System.out.println("❌ User not found!");
            return Optional.empty();
        }

        String storedHashedPassword = user.get().getPassword();
        System.out.println("🔑 Stored password hash: " + storedHashedPassword);

        boolean passwordMatch = passwordEncoder.matches(rawPassword, storedHashedPassword);
        System.out.println("✅ Password match: " + passwordMatch);

        if (passwordMatch) {
            System.out.println("🎉 Login successful!");
            return user;
        } else {
            System.out.println("❌ Incorrect password!");
            return Optional.empty();
        }
    }
}
