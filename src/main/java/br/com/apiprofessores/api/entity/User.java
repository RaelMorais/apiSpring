package br.com.apiprofessores.api.entity;

import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Table (name = "Users")
@Entity (name = "Users")
public class User implements UserDetails {
    private String id;

    private String login;

    private String password;

    private String role; 
}
