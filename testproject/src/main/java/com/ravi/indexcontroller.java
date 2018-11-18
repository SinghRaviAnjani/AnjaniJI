package com.ravi;

@Controller
public class indexcontroller {
	
	@Autowired                      //@ Autowired to create a object and at that class using @componenet.
	feedbackdao fbdo ;
	
	Feedback feedbackk;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
@RequestMapping("/feeback")
	public String feedback() {
		
		return "feedback.jsp";
	}

@RequestMapping("/addfeedback")
                                          //public String addfeedback(@RequestParam("name")String name , @RequestParam("email")String email ,@RequestParam("reg") String reg ,@RequestParam("code") int code ,@RequestParam("msg") String msg ) {
public String addfeedback(@ModelAttribute("feedback") Feedback feedback) {

	//feedbackk = new Feedback(name,email,reg,code,msg);

	fbdo.addfeedback (feedbackk);
	return "welcome.jsp";
}


}
