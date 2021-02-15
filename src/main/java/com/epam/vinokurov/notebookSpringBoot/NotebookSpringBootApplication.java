package com.epam.vinokurov.notebookSpringBoot;

import com.epam.vinokurov.notebookSpringBoot.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class NotebookSpringBootApplication {

	@Autowired
	private NotebookService notebookService;

	public static void main(String[] args) {
		SpringApplication.run(NotebookSpringBootApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private void test() {
		notebookService.findAll().forEach(it -> System.out.println(it));
	}
}

