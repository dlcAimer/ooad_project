import taskInfo.TaskDef;
import taskInfo.TaskPerformer;
import taskInfo.UserTaskStatus;
import utils.GeneratorUtil;

import java.util.ArrayList;

/**
 * Created by Aliez on 2019/12/18.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<TaskDef> initialTasks = GeneratorUtil.generateTasks();
        ArrayList<TaskPerformer> initialPerformers = GeneratorUtil.generatePerformers();
    }
}
