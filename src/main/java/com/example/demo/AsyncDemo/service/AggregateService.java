package com.example.demo.AsyncDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AggregateService {
	
	@Autowired
	AsyncService asyncService;
	
	public List<String> getListAll() {
		/*
		log.info("getListAll...");
		
		log.info("Before getListB...");
		CompletableFuture<List<String>> futureListB = asyncService.getListB();
		log.info("After getListB...");
		
		log.info("Before getListS...");
		CompletableFuture<List<String>> futureListS = asyncService.getListS();
		log.info("After getListS...");
		
		log.info("Before getListC...");
		CompletableFuture<List<String>> futureListC = asyncService.getListC();
		log.info("After getListC...");
	
		log.info("Before getListT...");
		CompletableFuture<List<String>> futureListT = asyncService.getListT();
		log.info("After getListT...");


		return Stream.of(futureListB, futureListS, futureListC, futureListT)
				.map(CompletableFuture::join)
				.flatMap(List::stream)
				.collect(Collectors.toList());
				

		*/

		List<String> listAll = new ArrayList<String>();
		
		log.info("getListAll...");
		
		log.info("Before getListB...");
		CompletableFuture<List<String>> futureListB = asyncService.getListB(listAll);
		log.info("After getListB...");
		
		log.info("Before getListS...");
		CompletableFuture<List<String>> futureListS = asyncService.getListS(listAll);
		log.info("After getListS...");
		
		log.info("Before getListC...");
		CompletableFuture<List<String>> futureListC = asyncService.getListC(listAll);
		log.info("After getListC...");
	
		log.info("Before getListT...");
		CompletableFuture<List<String>> futureListT = asyncService.getListT(listAll);
		log.info("After getListT...");
		
		Stream.of(futureListB, futureListS, futureListC, futureListT)
		.map(CompletableFuture::join)
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
	    return listAll;
	     
	}

}
