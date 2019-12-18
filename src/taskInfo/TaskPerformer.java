package taskInfo;

/**
 * Created by Aliez on 2019/12/18.
 */
public class TaskPerformer {
    private String name;

    TaskPerformer(String initialName){
        this.name = initialName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
