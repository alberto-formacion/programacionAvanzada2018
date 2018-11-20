package com.sanluis.spring.MartaBlog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sanluis.spring.MartaBlog.service.PostService;
import com.sanluis.spring.MartaBlog.vo.Post;
import com.sanluis.spring.MartaBlog.vo.Usuario;


@Controller
@RequestMapping(value="/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	@GetMapping
	public String getAll(ModelMap model) {
		
		List<Post> posts = postService.getAll();
		model.addAttribute("posts", posts);

		return "posts";
	}
	
	
	
	@GetMapping(value="/update/{argument}")
	public String update(@PathVariable("argument") String id, ModelMap model) {
		Post post = postService.findById(Integer.parseInt(id));
		model.addAttribute("post", post);
		
		return "postUpdate";
	}
	
	@PostMapping
	public String submit(Model model, @ModelAttribute("PostBean") PostBean postBean) {
	    if (postBean != null && postBean.getTitulo() != "" && postBean.getContenido() != "") {
	    	Post post = postService.findById(postBean.getId());
	    	
	    }
	    Post post = postService.findById(postBean.getId());
	    model.addAttribute("post", post);
	    model.addAttribute("error", "Introduce todas las credenciales");
    	return "postUpdate";
	      
	 }

	@GetMapping(value="/new")
	public String nuevoPost(ModelMap model) {	
		return "newPost";
	}
	
	/*@PostMapping
	public String submitNewPost(Model model, @ModelAttribute("PostBean") PostBean postBean) {
	    if (postBean != null && postBean.getTitulo() != "" && postBean.getContenido() != "") {
	    	Post post = new Post();
	    	
	    }
	    Post post = postService.findById(postBean.getId());
	    model.addAttribute("post", post);
	    model.addAttribute("error", "Introduce todas las credenciales");
    	return "postUpdate";
	      
	 }*/
	
	
}	