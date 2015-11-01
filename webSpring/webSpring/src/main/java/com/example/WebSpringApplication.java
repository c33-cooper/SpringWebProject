package com.example;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebSpringApplication {

    public static void main(String[] args) throws ServletException, LifecycleException{
    	ApplicationContext ctx = SpringApplication.run(WebSpringApplication.class, args);
    	
    	listBeans(ctx);
    }
    
  //Lists all beans active in the application context
  	//Use to view if a specific bean has been created
  	public static void listBeans(ApplicationContext ctx)
  	{
  		String s;
  		
  		for(int i = 0; i < ctx.getBeanDefinitionCount(); i++)
  		{
  			s = (ctx.getBeanDefinitionNames()[i]);
  			
  			System.out.println("------> Bean " + (i + 1) + " : " + s);
  		}
  	}
}
