package com.kristian.workshop_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kristian.workshop_mongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
}
