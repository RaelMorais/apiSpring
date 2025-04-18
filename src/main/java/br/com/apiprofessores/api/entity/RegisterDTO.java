package br.com.apiprofessores.api.entity;

public record RegisterDTO(String login, String password, UserRole role) {
}
