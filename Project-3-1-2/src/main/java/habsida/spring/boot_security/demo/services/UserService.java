package habsida.spring.boot_security.demo.services;


import habsida.spring.boot_security.demo.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    void remove(long id);

    void update(User user);

    Optional<User> userById(long id);

    Optional<UserDetails> findByEmail(String userName);
}
