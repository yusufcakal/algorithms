package pojo;

import java.util.ArrayList;
import java.util.List;

public class Training {

    private List<Boolean> booleanList = new ArrayList<>();
    private String type;

    public Training() {}

    public List<Boolean> getBooleanList() {
        return booleanList;
    }

    public void setBooleanList(List<Boolean> booleanList) {
        this.booleanList = booleanList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Training getSampleData(){
        Training training = new Training();
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(false);
        training.setBooleanList(booleanList);
        return training;
    }

}
