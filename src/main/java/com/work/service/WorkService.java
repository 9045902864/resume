package com.work.service;

import com.work.model.Day;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class WorkService {

    public void store(Day day) {
        System.out.println("service");
        writeToFile(convertToCSVLine(day));
    }

    private String convertToCSVLine(Day day) {
        return day.getDate()+","+day.getIssue()+","+day.getDescription();
    }


    private void writeToFile(String line) {
        System.out.println("writing method");
//        new Thread(() -> {
            System.out.println("writing");
            try {
                Files.write(Paths.get("K:\\ankush\\work.txt"), line.getBytes());
            }   catch (Exception e){
                e.printStackTrace();
            }
//        });

        System.out.println("writing method finish");
    }
}
