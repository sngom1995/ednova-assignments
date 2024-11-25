package ia.ednova.backend.assignement2.services;

import ia.ednova.backend.assignement2.domains.Post;
import ia.ednova.backend.assignement2.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    @Override
    public Post getPostById(String id) {
        return postRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }
}
