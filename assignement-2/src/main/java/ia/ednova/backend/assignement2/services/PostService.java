package ia.ednova.backend.assignement2.services;

import ia.ednova.backend.assignement2.domains.Post;

import java.util.List;

public interface PostService {

    Post getPostById(String id);
    List<Post> getPosts();
    Post createPost(Post post);
}
