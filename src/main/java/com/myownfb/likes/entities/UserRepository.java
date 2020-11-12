package com.myownfb.likes.entities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
//    User findByName(String name);
    List findByName(String name);
    List deleteByName(String name);
}
