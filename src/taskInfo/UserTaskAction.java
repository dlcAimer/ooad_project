package taskInfo;

import java.util.Date;

/**
 * Created by Aliez on 2019/12/18.
 */
public class UserTaskAction {
    private Date actionTime;

    UserTaskAction(Date actionTime){
        this.actionTime = actionTime;
    }

    UserTaskAction(){
        this.actionTime = new Date();
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}
