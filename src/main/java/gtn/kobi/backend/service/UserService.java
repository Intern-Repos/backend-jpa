package gtn.kobi.backend.service;

import gtn.kobi.backend.model.User;

public interface UserService {
    User signUp(User user);
    User signIn(String userName, String password);
}
