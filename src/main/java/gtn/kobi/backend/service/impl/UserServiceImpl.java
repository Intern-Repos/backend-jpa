package gtn.kobi.backend.service.impl;

import gtn.kobi.backend.model.Users;
import gtn.kobi.backend.repository.UserRepository;
import gtn.kobi.backend.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Users signUp(Users users) {
        //encoding the user password before saving it to the db
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        return userRepository.save(users);
    }

    @Override
    public Users signIn(String userName, String password) {
            Users users = userRepository.findByUsername(userName).orElse(null);
            if (users != null && passwordEncoder.matches(password, users.getPassword())) {
                return users;
            }

            return null;
    }

    @Override
    public Users findByUsername(String username) {
       return userRepository.findByUsername(username).orElse(null);
    }

}
