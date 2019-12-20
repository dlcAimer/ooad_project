package lifeCycleStrategies;

import taskInfo.UserTaskAction;

public class TotalCountDownLifeCycleStrategy extends TaskLifeCycleStrategy {
    private int count;

    public TotalCountDownLifeCycleStrategy(int initialCount){
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

    public boolean divideCount(){
        if (this.count > 0){
            this.count--;
            return true;
        }
        return false;
    }
}
