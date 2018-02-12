package eu.dreamix.ms.service;

import eu.dreamix.ms.entity.User;

public interface UserService {

    User registerUser(User input);

    boolean deleteUser(String username);

    Iterable<User> findAll();
}
