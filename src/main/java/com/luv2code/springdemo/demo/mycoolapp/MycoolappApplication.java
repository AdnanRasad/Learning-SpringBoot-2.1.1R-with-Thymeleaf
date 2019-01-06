package com.luv2code.springdemo.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	//from start.spring.io, we gave ur app name as artifactid: mycoolapp 
	//group id as com.luv2code.springdemo.demo
	//dependencies as web
	//downloaded the zip and unzipped it, imported as existing maven in elipse
	//now we can run it without 'run as >run on server', just by right clicking on Mycoolappliation.java, clicking run as>java application
	//then we got the white page error whic isnt a error actually just bcz we didnt add any controller(routing)
	//so we added our rest controller for /
	
	//mvnw (linux)+mvnw.cmd (windows) is for 'if you do not have the correct version of maven nstalled, these will automatically download the maven that is required.'
	//if you have maven, u can dlt these
	//pom-->spring boot starter web-->collection of dependencies: spring hibernate, tomcta, json etc
	//pom-->spring boot maven plugin-->for war packaging like: ./mvnw package or mvn package, mvn spring-boot:run and also for running the app by : ./mvnw spring-boot:run
	//@SpringBootApplication(imported first)-->@EnableAutoConfiguration+@ComponentScan(scanning current package and recursively scans sub-packages)+@Configuration(for extra beans, @Bean)
	//SpringApplication.run(imported first)-->creates app context and registers all beans, starts the embedded server, tomcat,etc
	
	
	
	//place your main application in the root package, so it can scan and register aand find all other packages. 
	//if you want to use other names for other packages for example, 'org.acme.iot.utils', then use, @SpringBootApplication(scanBasePackages={"com.luv2code.springboot.demo.mycoolapp","org.acme.iot.utils","bla bla"})
	
	//resources/application.properties this file is for properties like you can write, server.port=8484 or
	//coach.name=Adnan Rasad
	//that spring boot reads..to use these props, 
	//@Value("${coach.name}") 
	//private String coachName;
	
	//Html, css, js, images all goes to static folder, spring will auto load them from staticfolder
	//Do not use src/main/webapp if your app is packaged as a JAR, it only works with war packaging, it is silently ignored by most build tools if you generate a jar 
	
	//For FreeMarker/Thymeleaf/Mustache engines use template folder
	
	
	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

