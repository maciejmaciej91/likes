package com.myownfb.likes.entities;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<User, Integer> {

}