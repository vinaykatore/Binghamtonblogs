package com.binghamton.databaseconfig;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.binghamton.beans.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String> {
	
	 public User findByFirstName(@Param("firstName") String firstName);
	    public List<User> findByLastName(@Param("lastName") String lastName);

}
