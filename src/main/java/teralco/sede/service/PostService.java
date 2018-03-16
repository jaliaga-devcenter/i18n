package teralco.sede.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import teralco.sede.model.Post;
import teralco.sede.repository.PostRepository;

public class PostService {
	private PostRepository postRepository;

	@Autowired
	public PostService(PostRepository pPostRepository) {
		this.postRepository = pPostRepository;
	}

	public Iterable<Post> list() {
		return this.postRepository.findAll();
	}

	public Optional<Post> get(Long id) {
		return this.postRepository.findById(id);
	}

	// save
	public Post save(Post pPost) {
		return this.postRepository.save(pPost);
	}
}
