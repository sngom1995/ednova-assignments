package ia.ednova.backend.assignement2.controllers;


import ia.ednova.backend.assignement2.domains.Post;
import ia.ednova.backend.assignement2.dtos.PostDto;
import ia.ednova.backend.assignement2.services.PostService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;
    @GetMapping("/posts")
    public ResponseEntity<?> getPosts(){
        return ResponseEntity.ok(postService.getPosts());
    }

    @PostMapping("/posts")
    public ResponseEntity<?> addPost(@RequestBody PostDto post){
        Post post1 = Post.builder()
                .title(post.getTitle())
                .content(post.getContent())
                .author(post.getAuthor())
                .build();
        try {
            return ResponseEntity.ok(postService.createPost(post1));
        }
        catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
