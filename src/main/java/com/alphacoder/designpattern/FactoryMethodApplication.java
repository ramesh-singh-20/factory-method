package com.alphacoder.designpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FactoryMethodApplication {
	private static final String MANUFACTURED = "{} manufactured {}";

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);

		ButtonCreator windowButtonCreator= new WindowButtonCreator();
		Button button= windowButtonCreator.getButton(ButtonType.SUBMIT);
		log.info(MANUFACTURED, windowButtonCreator, button);

		button= windowButtonCreator.getButton(ButtonType.UPDATE);
		log.info(MANUFACTURED, windowButtonCreator, button);

		ButtonCreator htmlButtonCreator= new HtmlButtonCreator();
		button= htmlButtonCreator.getButton(ButtonType.DELETE);
		log.info(MANUFACTURED, htmlButtonCreator, button);

	}

}
