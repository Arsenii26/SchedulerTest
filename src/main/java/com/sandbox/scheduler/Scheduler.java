package com.sandbox.scheduler;

import com.sandbox.scheduler.model.Task;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scheduler {
    // priority: 0-5, RED|BLUE|GREEN, TIME
    public static void scheduleTask(List<Task> unsorted) throws Exception {
        // urgency must be from 0 to 5
        for (int i = 0; i < unsorted.size(); i++) {
            if(unsorted.get(i).urgency < 0 || unsorted.get(i).urgency > 5) {
                throw new Exception("Urgency must be from 0 to 5");
            }
        }
        Collections.sort(unsorted, Comparator.comparing((Task task)->task.urgency)
                .thenComparing(task->task.category.getValue())
                .thenComparing(task->task.timeStamp));
    }

    // just print all elements from the list
    public static void printSchedule(List<Task> unsorted) {
        unsorted.forEach(System.out::println);
    }


}
