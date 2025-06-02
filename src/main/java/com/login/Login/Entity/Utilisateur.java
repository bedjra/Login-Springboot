package com.login.Login.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String prenom;

    @Email(message = "Email invalide")
    @Column(unique = true)
    private String email;

    private String password;

    @Transient // Ce champ n’est pas enregistré en base
    private String confirmPassword;





}
