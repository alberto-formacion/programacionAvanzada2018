package com.sanluis.spring.MartaBlog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanluis.spring.MartaBlog.service.PostService;
import com.sanluis.spring.MartaBlog.service.UsuarioService;
import com.sanluis.spring.MartaBlog.vo.Post;
import com.sanluis.spring.MartaBlog.vo.Usuario;

@Controller
@RequestMapping(value="/login")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private PostService postService;
	
	@GetMapping
	public String getAll(ModelMap model) {

		return "login";
	}
	
	@PostMapping
	  public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
	    if (loginBean != null && loginBean.getUserName() != "" & loginBean.getPassword() != "") {
	    	List<Usuario> users = usuarioService.getAll();
	    	for (int i = 0; i < users.size(); i++) {
	    		if (loginBean.getUserName().equals(users.get(i).getUser()) && loginBean.getPassword().equals(users.get(i).getPass())) {
	    	        model.addAttribute("user", users.get(i));
	    	        List<Post> posts = new ArrayList<Post>();
	    	        if(users.get(i).getRol().getNombre().equals("admin")) {
	    	        	 posts = postService.getAllByidAutor(users.get(i).getId());
	    	        } else {
	    	        	 posts = postService.getAll();
	    	        }
	    	       
	    	        model.addAttribute("posts", posts);
	    	        return "posts";
	    	      } 
	    	 } 
	    	model.addAttribute("error", "Credenciales Incorrectas");
	    	return "login";
	    	
	    }
	    model.addAttribute("error", "Introduce las credenciales");
    	return "login";
	      
	  }
}
