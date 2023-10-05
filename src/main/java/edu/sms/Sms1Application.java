package edu.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import edu.sms.config.JwtFilter;

//@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@SpringBootApplication
public class Sms1Application {

//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	
//	@Bean
//	public FilterRegistrationBean jwtFilter()
//	{
//		final FilterRegistrationBean register = new FilterRegistrationBean();
//		register.setFilter(new JwtFilter());
//		register.addUrlPatterns("/api/*");
//		return register;
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Sms1Application.class, args);
	}

}
