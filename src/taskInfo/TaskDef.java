package taskInfo;

/**
 * Created by Aliez on 2019/12/18.
 */
public class TaskDef {
    private String name;
    private KindOfTask kind;
    private int numberOfCompletions;

    public TaskDef(String initialName, KindOfTask initialKind, int initialNumber){
        this.name = initialName;
        this.kind = initialKind;
        this.numberOfCompletions = initialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KindOfTask getKind() {
        return kind;
    }

    public void setKind(KindOfTask kind) {
        this.kind = kind;
    }

    public int getNumberOfCompletions() {
        return numberOfCompletions;
    }

    public void setNumberOfCompletions(int numberOfCompletions) {
        this.numberOfCompletions = numberOfCompletions;
    }
}
