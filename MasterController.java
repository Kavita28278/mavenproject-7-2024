package com.MainApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.MainApp.Pojo.Vote;
import com.MainApp.Pojo.User;
import com.MainApp.Repo.UserRepo;
import com.MainApp.Repo.VoteRepo;

@Controller
public class MasterController {

	@Autowired
	UserRepo uRepo;
	@Autowired
	VoteRepo vRepo;
	
	@RequestMapping("/")
	public String temp()
	{
		return "register";
	}
	
	@RequestMapping("/reg")
	public String regProcess(@ModelAttribute User u)
	{
		uRepo.save(u);
		return "login";
	}
	
	
	@RequestMapping("/login")
	public ModelAndView loginProcess(@ModelAttribute User u)
	{
		User u1=uRepo.findByUserNameAndPassword(u.getUserName(), u.getPassword());
		if(u1!=null)
		{
			ModelAndView mv1 = new ModelAndView("vote");
			mv1.addObject("check", u.getUserName());
			return mv1;
		}
		else
		{
			ModelAndView mv2 = new ModelAndView("login");
			return mv2;
		}
	}
	
	@RequestMapping("/vote")
	public String voteProcess(@ModelAttribute Vote v)
	{
		vRepo.save(v);
		System.out.print(v.getCname());
		return "register";
	}
	
	@RequestMapping("/admin")
	public ModelAndView adminprocess()
	{
		ModelAndView mv = new ModelAndView("admin");
		
		mv.addObject("c1", vRepo.countByCname("Ram"));
		mv.addObject("c2", vRepo.countByCname("Shyam"));
		mv.addObject("c3", vRepo.countByCname("Raju"));
		return mv;
		
			
	}
}
