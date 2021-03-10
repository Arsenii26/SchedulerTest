/*
Made by Arsenii (Mar 9, 2021)
 */
package com.sandbox.scheduler;

import com.sandbox.scheduler.model.Category;
import com.sandbox.scheduler.model.Task;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class App {

	public static void main(String[] args) throws Exception {

		// test data
		Task task1 = new Task(2, Category.RED);
		Task task2 = new Task(0, Category.BLUE);
		Task task3 = new Task(0, Category.GREEN);
		Task task4 = new Task(0, Category.GREEN);
		Task task5 = new Task(0, Category.RED);
		Task task6 = new Task(1, Category.RED);
//
//		Task task1 = new Task(0, Category.RED);
//		Task task2 = new Task(0, Category.BLUE);
//		Task task3 = new Task(0, Category.GREEN);
//		Task task4 = new Task(0, Category.GREEN);
//		Task task5 = new Task(0, Category.RED);
//		Task task6 = new Task(0, Category.RED);


		List<Task> unsorted = Arrays.asList(task1, task2, task3, task4, task5, task6);


		//Uncoment your line after implementing Scheduler.scheduleTask
//		unsorted.forEach(t -> Scheduler.scheduleTask(t));

		// To be honest I don't think it's possible to sort without comparator: here the nice Java 8 way
		Scheduler.scheduleTask(unsorted);

		//Uncoment your line after implementing Scheduler.printSchedule()
		Scheduler.printSchedule(unsorted);
	}


}
