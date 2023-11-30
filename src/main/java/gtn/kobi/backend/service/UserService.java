package gtn.kobi.backend.service;

import gtn.kobi.backend.model.Users;

public interface UserService {
    Users signUp(Users users);
    Users signIn(String userName, String password);

    Users findByUsername(String usrename);
}
