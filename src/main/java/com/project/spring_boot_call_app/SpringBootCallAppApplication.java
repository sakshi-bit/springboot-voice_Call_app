package com.project.spring_boot_call_app;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringBootCallAppApplication implements ApplicationRunner {
	
	
	        private final static String SID_ACCOUNT = "SID_twilio";
			private final static String AUTH_ID = "Auth_id_Twilio";
			private final static String FROM_NUMBER="twilio number";
			private final static String TO_NUMBER ="your number";
			
			static {
				   Twilio.init(SID_ACCOUNT, AUTH_ID);
				}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCallAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				   new URI("http://demo.twilio.com/docs/voice.xml")).create();
		
	}

}
