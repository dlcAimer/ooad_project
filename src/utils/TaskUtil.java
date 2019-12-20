package utils;

import lifeCycleStrategies.DailyCountDownLifeCycleStrategy;
import lifeCycleStrategies.OnceLifeCycleStrategy;
import lifeCycleStrategies.TotalCountDownLifeCycleStrategy;
import pointCycleStratrgies.FixPointStrategy;
import taskInfo.TaskDef;
import taskInfo.TaskPerformer;
import taskInfo.UserTask;

import java.util.Date;

/**
 * Created by Aliez on 2019/12/20.
 */
public class TaskUtil {
    public static UserTask assignTaskToPerformer(TaskDef task, TaskPerformer performer){
        UserTask newTask = null;
        switch (task.getKind()){
            case OnceLifeCycle:
                newTask = new UserTask(new OnceLifeCycleStrategy(), new FixPointStrategy(), task, performer);
                break;
            case TotalCountDownLifeCycle:
                newTask = new UserTask(new TotalCountDownLifeCycleStrategy(0), new FixPointStrategy(), task, performer);
                break;
            case DailyCountDownLifeCycle:
                newTask = new UserTask(new DailyCountDownLifeCycleStrategy(0), new FixPointStrategy(), task, performer);
                break;
        }
        return newTask;
    }

    public static void performTheTask(UserTask userTask, Date actionTime){
        userTask.addAction(actionTime);
        boolean ifFinish = userTask.shouldFinish();
        userTask.maintainPoint();
    }
}
