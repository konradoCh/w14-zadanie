package pl.zajavka;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserManagementInMemoryRepository implements UserManagementRepository {
    private Map<String, User> userMap = new HashMap<>();

    @Override
    public void create(User user) {
        userMap.put(user.getEmail(), user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        if(!userMap.containsKey(email)) {
            return Optional.empty();
        }
        return Optional.of(userMap.get(email));
    }
}
