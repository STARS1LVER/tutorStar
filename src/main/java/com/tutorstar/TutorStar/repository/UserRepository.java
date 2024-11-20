package com.tutorstar.TutorStar.repository;

import com.tutorstar.TutorStar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Repositorio para manejar operaciones de base de datos relacionadas con `User`.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
