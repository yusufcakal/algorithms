package pojo;

import java.util.ArrayList;
import java.util.List;

public class Goods {

    private double value, weight;

    public Goods() {}

    public Goods(double weight, double value) {
        this.value = value;
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static List<Goods> getDatas(){
        Goods goods1 = new Goods(4.0, 2.0);
        Goods goods2 = new Goods(2.0, 3.0);
        Goods goods3 = new Goods(3.0, 6.0);
        Goods goods4 = new Goods(2.0, 2.0);

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        return goodsList;
    }

}
