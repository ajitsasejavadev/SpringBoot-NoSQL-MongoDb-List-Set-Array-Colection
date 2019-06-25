package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Book;
import com.app.repo.BookRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	
	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		repo.deleteAll();
		repo.save(new Book(101,"REDR","ABC",55.55,
				Arrays.asList("A1","A2"),
				new String[] {"M1","M2"}
				));
	
	}

}
