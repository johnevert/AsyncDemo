package com.example.demo.AsyncDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AsyncService {
	
	
	/*
	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListB() {

		log.info("getListB");
		List<String> list = new ArrayList<String>();
	
		int max=10;
		for (int i=1; i<=max; i++) {
			 
			list.add("B" + Integer.toString(i));
		}
		//delay(10000);

		return CompletableFuture.completedFuture(list);
	}
	
	private CompletableFuture<List<String>> CompletableFuture(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListS() {

		log.info("getListS");
		List<String> list = new ArrayList<String>();
		
		int max=30;
		for (int i=1; i<=max; i++) {
			 
			list.add("S" + Integer.toString(i));
		}
		delay(10000);

		return CompletableFuture.completedFuture(list);
	}
	
	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListC() {

		log.info("getListC");
		List<String> list = new ArrayList<String>();
	
		int max=10;
		for (int i=1; i<=max; i++) {
			 
			list.add("C" + Integer.toString(i));
		}
		//delay(10000);

		return CompletableFuture.completedFuture(list);
	}	
	
	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListT() {

		log.info("getListT");
		List<String> list = new ArrayList<String>();
	
		int max=1;
		for (int i=1; i<=max; i++) {
			 
			list.add("T" + Integer.toString(i));
		}
		//delay(10000);

		return CompletableFuture.completedFuture(list);
	}		
	
	public void delay(long l) {
		
		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
	}
	*/

	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListB(List<String> list) {

		log.info("getListB");
		//List<String> list = new ArrayList<String>();
	
		int max=10;
		for (int i=1; i<=max; i++) {
			 
			list.add("B" + Integer.toString(i));
		}
		//delay(10000);

		return CompletableFuture.completedFuture(list);
	}
	
	
	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListS(List<String> list) {

		log.info("getListS");
		//List<String> list = new ArrayList<String>();
		
		int max=30;
		for (int i=1; i<=max; i++) {
			 
			list.add("S" + Integer.toString(i));
		}
		delay(10000);

		return CompletableFuture.completedFuture(list);
	}
	
	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListC(List<String> list) {

		log.info("getListC");
		//List<String> list = new ArrayList<String>();
	
		int max=10;
		for (int i=1; i<=max; i++) {
			 
			list.add("C" + Integer.toString(i));
		}
		//delay(10000);

		return CompletableFuture.completedFuture(list);
	}	
	
	@Async("asyncExecutor")
	public CompletableFuture<List<String>> getListT(List<String> list) {

		log.info("getListT");
		//List<String> list = new ArrayList<String>();
	
		int max=1;
		for (int i=1; i<=max; i++) {
			 
			list.add("T" + Integer.toString(i));
		}
		//delay(10000);

		return CompletableFuture.completedFuture(list);
	}		
	
	public void delay(long l) {
		
		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
	}
	
}
