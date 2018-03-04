package pojo;

public class Result {

    private double distance;
    private boolean flag;

    public Result(double distance, boolean flag) {
        this.distance = distance;
        this.flag = flag;
    }

    public Result() {

    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Result{" +
                "distance=" + distance +
                ", flag=" + flag +
                '}';
    }
}
