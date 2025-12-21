package com.kristian.workshop_mongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kristian.workshop_mongo.domain.User;
import com.kristian.workshop_mongo.repository.UserRepository;
import com.kristian.workshop_mongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
	    Optional<User> user = repo.findById(id);

	    if (user.isEmpty()) {
	        throw new ObjectNotFoundException(id);
	    }
	    return user.get();
	    }
}
