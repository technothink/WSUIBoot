package com.technothink.wsui;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WSUIApp {

	private static final Logger log = Logger.getLogger(WSUIApp.class);

	public static void main(String[] args) {
		SpringApplication.run(WSUIApp.class, args);
		log.info("WSUIApp started .... ");

	}
}
