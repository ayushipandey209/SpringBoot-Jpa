package com.LearningJpa12.dao;

import com.LearningJpa12.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User ,Integer>
{

}
