package gtn.kobi.backend.service.impl;

import gtn.kobi.backend.model.User;
import gtn.kobi.backend.repository.UserRepository;
import gtn.kobi.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User signUp(User user) {
        return null;
    }

    @Override
    public User signIn(String userName, String password) {
        return null;
    }
}
