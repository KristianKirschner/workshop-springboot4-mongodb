package com.kristian.workshop_mongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kristian.workshop_mongo.domain.Post;
import com.kristian.workshop_mongo.repository.PostRepository;
import com.kristian.workshop_mongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;

	public List<Post> findAll() {
		return repo.findAll();
	}

	public Post findById(String id) {
		Optional<Post> Post = repo.findById(id);

		if (Post.isEmpty()) {
			throw new ObjectNotFoundException(id);
		}
		return Post.get();
	}

}
