package br.com.apiprofessores.api.controller;

import br.com.apiprofessores.api.entity.AuthDTO;
import br.com.apiprofessores.api.entity.RegisterDTO;
import br.com.apiprofessores.api.entity.User;
import br.com.apiprofessores.api.repository.UserRepository;
import jakarta.validation.Valid;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth/")
public class authController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository repository;

    @PostMapping("/login")
    public ResponseEntity login (@RequestBody @Valid AuthDTO data){
        var usernmaePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(usernmaePassword);

        return ResponseEntity.ok().build();
    }


    @PostMapping("/register")
    public ResponseEntity register (@RequestBody @Valid RegisterDTO data){
         if(this.repository.findByLogin(data.login())!= null)
             return ResponseEntity.badRequest().build();
         String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
         User newUser = new User(data.login(), encryptedPassword, data.role());

         this.repository.save(newUser);

         return ResponseEntity.status(201).body("usuario criado");

    }
}
