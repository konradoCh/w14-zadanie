package pl.zajavka;

import java.util.Optional;

public class UserManagementService {
    private UserManagementRepository userManagementRepository;
    public void create(User user) {
       userManagementRepository.create(user);
    }

    public Optional<User> findByEmail(String email) {

        return userManagementRepository.findByEmail(email);
    }
}
