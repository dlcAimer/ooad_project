package lifeCycleStrategies;

import taskInfo.UserTaskAction;

/**
 * Created by Aliez on 2019/12/18.
 */
public class DailyCountDownLifeCycleStrategy extends TaskLifeCycleStrategy{

    private int count;

    DailyCountDownLifeCycleStrategy(int initialCount){
        this.count = initialCount;
    }

    @Override
    public boolean taskFinished(UserTaskAction action) {
        return false;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
