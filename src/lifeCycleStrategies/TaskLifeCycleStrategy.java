package lifeCycleStrategies;
import taskInfo.UserTaskAction;

/**
 * Created by Aliez on 2019/12/18.
 */
public abstract class TaskLifeCycleStrategy {
    abstract public boolean taskFinished(UserTaskAction action);
}
