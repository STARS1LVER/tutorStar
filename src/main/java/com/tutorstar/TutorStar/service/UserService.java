package com.tutorstar.TutorStar.service;


import com.tutorstar.TutorStar.entity.User;
import com.tutorstar.TutorStar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    /**
     * Obtiene todos los usuarios de la base de datos.
     * @return Lista de entidades `User`.
     */

    public List < User > getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Guarda un usuario en la base de datos.
     * @param user Entidad `User` a guardar.
     * @return Usuario guardado.
     */
    public User savedUser( User user ){
        return  userRepository.save(user);
    }



}
