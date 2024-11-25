package ia.ednova.backend.assignement2.repositories;

import ia.ednova.backend.assignement2.domains.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository  extends MongoRepository<Post, String> {
}
