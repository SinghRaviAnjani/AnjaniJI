package com.feedbackdao;

import org.springframework.stereotype.Component;

import com.entity.Feedbak;
@Component
public class Feedbackdao {

			public void addfeedback(Feedbak fb){
			
			System.out.println("I am coming" + fb);

}
}
