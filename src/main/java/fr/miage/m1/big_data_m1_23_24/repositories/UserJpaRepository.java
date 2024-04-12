package fr.miage.m1.big_data_m1_23_24.repositories;

import fr.miage.m1.big_data_m1_23_24.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {

    public User findByFirstnameAndLastname(String firstname, String lastname);
}
