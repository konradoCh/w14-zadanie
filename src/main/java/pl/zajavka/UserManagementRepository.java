package pl.zajavka;

import java.util.Optional;

public interface UserManagementRepository {
    void  create(User user);

    Optional<User> findByEmail(String email);
}
