package com.tutorstar.TutorStar.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data // Genera getters, setters, equals, hashCode y toString
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos

public class UserDto {
    private Long id; // Identificador único del usuario
    private String name; // Nombre del usuario
    private String lastName; // Apellido del usuario
    private String email; // Correo electrónico
    private int semester; // Semestre del usuario
    private String modality; // Modalidad de estudio
    private String career; // Carrera del usuario
    private LocalDateTime createdAt; // Fecha de creación
    private LocalDateTime updatedAt; // Fecha de última actualización
}
