package lifeCycleStrategies;

import taskInfo.UserTaskAction;

public class OnceLifeCycleStrategy extends TaskLifeCycleStrategy{

    public OnceLifeCycleStrategy(){}

    @Override
    public boolean taskFinished(UserTaskAction action) {
        return true;
    }
}
