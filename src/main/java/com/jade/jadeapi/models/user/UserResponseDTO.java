package com.jade.jadeapi.models.user;

public record UserResponseDTO(Long id, String full_name, String email) {
    public UserResponseDTO(User user){
        this(user.getId(), user.getFull_name(), user.getEmail());
    }
}
