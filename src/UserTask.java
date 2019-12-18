import lifeCycleStrategies.TaskLifeCycleStrategy;
import taskInfo.TaskDef;
import taskInfo.TaskPerformer;
import taskInfo.UserTaskAction;
import taskInfo.UserTaskStatus;

import java.util.ArrayList;

/**
 * Created by Aliez on 2019/12/18.
 */
public class UserTask {
    private UserTaskStatus status;
    private TaskLifeCycleStrategy lifeCycleStrategy;
    private TaskDef taskName;
    private TaskPerformer performerName;
    private ArrayList<UserTaskAction> actions;

    UserTask(TaskLifeCycleStrategy initialStrategy, TaskDef initialTaskName, TaskPerformer initialPerformerName){
        this.status = UserTaskStatus.ACTIVE;
        this.lifeCycleStrategy = initialStrategy;
        this.taskName = initialTaskName;
        this.performerName = initialPerformerName;
        this.actions = new ArrayList<>();
    }

    public UserTaskStatus getStatus() {
        return status;
    }

    public void setStatus(UserTaskStatus status) {
        this.status = status;
    }

    public boolean shouldFinish(){
        return lifeCycleStrategy.taskFinished(this.actions.get(actions.size() - 1));
    }

    public TaskDef getTaskName() {
        return taskName;
    }

    public void setTaskName(TaskDef taskName) {
        this.taskName = taskName;
    }

    public TaskPerformer getPerformerName() {
        return performerName;
    }

    public void setPerformerName(TaskPerformer performerName) {
        this.performerName = performerName;
    }

    public void addAction(UserTaskAction newAction){
        this.actions.add(newAction);
    }
}
