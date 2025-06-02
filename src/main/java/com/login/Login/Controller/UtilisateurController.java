package com.login.Login.Controller;

import com.login.Login.Entity.Utilisateur;
import com.login.Login.service.UtilisateurService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")


public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;


    @PostMapping("/register")
    public Utilisateur saveUtilisateur(@Valid @RequestBody Utilisateur utilisateur) {
        return utilisateurService.saveUtilisateur(utilisateur);
    }
}
