/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web.interfaces;

import Reto2_Web.modelo.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceUser extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    List<User> findBybirthtDay(Date date);
    Optional <User> findByEmailAndPassword(String email,String password);
    
    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
