package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.User;
import fr.miage.m1.big_data_m1_23_24.repositories.UserJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceJpaImpl implements UserService {

    private final UserJpaRepository userRepository;

    public UserServiceJpaImpl(UserJpaRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User author) {
        return userRepository.save(author);
    }

    @Override
    public User edit(User author) {
        return userRepository.save(author);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
