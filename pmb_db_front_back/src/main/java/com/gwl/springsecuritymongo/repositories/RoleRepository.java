/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwl.springsecuritymongo.repositories;

import com.gwl.springsecuritymongo.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author didin
 */
public interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);
    
}
