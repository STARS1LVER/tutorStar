package com.tutorstar.TutorStar.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private int semester;
    private String modality;
    private String career;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String password; // Agrega este campo

    // Getters y setters para password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}