package com.example.demo.AsyncDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;

import com.example.demo.AsyncDemo.service.AggregateService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {

	public static List<String> completeList = new ArrayList<String>();

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		log.info("test main()......");

		AggregateService service = (AggregateService) context.getBean(AggregateService.class);

		List<String> listAll = service.getListAll();
		log.info("********************* listAll.size()={} ********************* ", listAll.size());
		listAll.stream().forEach((s) -> {
			log.info("{}", s);
		});

	}
}
