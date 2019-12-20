package taskInfo;

import lifeCycleStrategies.TaskLifeCycleStrategy;
import pointCycleStratrgies.TaskPointCalcStrategy;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Aliez on 2019/12/18.
 */
public class UserTask {
    private UserTaskStatus status;
    private TaskLifeCycleStrategy lifeCycleStrategy;
    private TaskPointCalcStrategy pointCalcStrategy;
    private TaskDef task;
    private TaskPerformer performer;
    private ArrayList<UserTaskAction> actions;

    public UserTask(TaskLifeCycleStrategy initialLifeCycleStrategy, TaskPointCalcStrategy initialPointCalcStrategy, TaskDef initialTask, TaskPerformer initialPerformer) {
        this.status = UserTaskStatus.ACTIVE;
        this.lifeCycleStrategy = initialLifeCycleStrategy;
        this.pointCalcStrategy = initialPointCalcStrategy;
        this.task = initialTask;
        this.performer = initialPerformer;
        this.actions = new ArrayList<>();
    }

    public UserTaskStatus getStatus() {
        return status;
    }

    public void setStatus(UserTaskStatus status) {
        this.status = status;
    }

    public boolean shouldFinish() {
        if(lifeCycleStrategy.taskFinished(this.actions.get(actions.size() - 1))){
            setStatus(UserTaskStatus.FINISHED);
            return true;
        }
        return false;
    }

    public void maintainPoint() {
        this.pointCalcStrategy.calcPoint();
    }

    public TaskDef getTask() {
        return task;
    }

    public void setTask(TaskDef task) {
        this.task = task;
    }

    public TaskPerformer getPerformer() {
        return performer;
    }

    public void setPerformer(TaskPerformer performer) {
        this.performer = performer;
    }

    public void addAction(Date actionTime) {
        this.actions.add(new UserTaskAction(actionTime));
    }
}
