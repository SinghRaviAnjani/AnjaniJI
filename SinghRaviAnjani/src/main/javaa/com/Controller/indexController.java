package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Feedbak;
import com.feedbackdao.Feedbackdao;



@Controller
public class indexController {

	

		@Autowired
		Feedbackdao fdo;
		Feedbak feedbackk;

		
		  
		@RequestMapping("/home")
		public String Home()
		{
			 
			return "index.jsp";
		}
		
		@RequestMapping(value="/feed.html", method=RequestMethod.GET )
		public String Feedback(){
			
			return "feedback.jsp";
		}
		
		@RequestMapping(value="/addfeed",  method=RequestMethod.POST)
		public String addFeedback(@ModelAttribute ("feedbackk") Feedbak feedbackk){  //used "feedbackk to use as later"
		
		  // feedbackk = new Feedback(name,email,reg,code,msg);
			fdo.addfeedback(feedbackk);
			return "welcome.jsp";
		}

	}
