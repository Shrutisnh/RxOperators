package com.example.rxoperators;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Task> createTasksList(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Take out the trash",2,true));
        tasks.add(new Task("Walk the dog",3,false));
        tasks.add(new Task("Make my bed",1, true));
        tasks.add(new Task("Unload the dishwasher",0, false));
        tasks.add(new Task("Make dinner",5,true));
        return tasks;
    }
}
