package com.roo.team01.web;
import com.roo.team01.domain.Post;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/posts")
@Controller
@RooWebScaffold(path = "posts", formBackingObject = Post.class)
public class PostController {
}
