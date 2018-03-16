package teralco.sede.repository;

import org.springframework.data.repository.CrudRepository;

import teralco.sede.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
