package utils;

import taskInfo.KindOfTask;
import taskInfo.TaskDef;
import taskInfo.TaskPerformer;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Aliez on 2019/12/20.
 */
public class GeneratorUtil {
    public static ArrayList<TaskDef> generateTasks(){
        ArrayList<TaskDef> tasks = new ArrayList<>();
        try {
            File file = new File("src/information/NamesOfTasks");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String strLine = "";
            while(null != (strLine = bufferedReader.readLine())){
                String[] temp = strLine.split(",");
                String nameOfTask = temp[0];
                KindOfTask kindOfTask = null;
                int numberOfCompletions = Integer.parseInt(temp[2]);
                switch (temp[1]){
                    case "OnceLifeCycle":
                        kindOfTask = KindOfTask.OnceLifeCycle;
                        break;
                    case "TotalCountDownLifeCycle":
                        kindOfTask = KindOfTask.TotalCountDownLifeCycle;
                        break;
                    case "DailyCountDownLifeCycle":
                        kindOfTask = KindOfTask.DailyCountDownLifeCycle;
                        break;
                }
                tasks.add(new TaskDef(nameOfTask, kindOfTask, numberOfCompletions));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return tasks;
    }

    public static ArrayList<TaskPerformer> generatePerformers(){
        ArrayList<TaskPerformer> performers = new ArrayList<>();
        try {
            File file = new File("src/information/NamesOfPerformers");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String strLine = "";
            while(null != (strLine = bufferedReader.readLine())){
                performers.add(new TaskPerformer(strLine));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return performers;
    }
}
