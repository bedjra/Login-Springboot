package com.login.Login.service;

import com.login.Login.Entity.Utilisateur;
import com.login.Login.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {

        // Vérification du mot de passe
        if (!utilisateur.getPassword().equals(utilisateur.getConfirmPassword())) {
            throw new RuntimeException("Les mots de passe ne correspondent pas");
        }

        // Sauvegarde
        return utilisateurRepository.save(utilisateur);
    }


}
