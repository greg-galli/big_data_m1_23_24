package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;
}
