package com.sanluis.spring.MartaBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sanluis.spring.MartaBlog.service.PostService;
import com.sanluis.spring.MartaBlog.vo.Post;


@Controller
@RequestMapping(value="/posts")
public class PostController {
	@Autowired
	private PostService postService;
	
	@GetMapping
	public String getAll(ModelMap model) {
		
		List<Post> posts = postService.getAll();
		model.addAttribute("posts", posts);

		return "posts";
	}
}	