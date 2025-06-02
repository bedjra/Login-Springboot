package com.login.Login.Controller;

import com.login.Login.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")


public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;


//    @Autowired
//    private JwtUtil jwtUtil;


}
