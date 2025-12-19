package com.kristian.workshop_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kristian.workshop_mongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
