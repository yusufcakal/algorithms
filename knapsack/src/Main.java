import pojo.Goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        double weight = 6.0;
        List<Goods> goodsList = Goods.getDatas();
        System.out.println(knapsack(goodsList, weight));

    }

    private static double knapsack(List<Goods> goodsList, double weight){

        double value = 0.0;
        List<Double> list = new ArrayList<>();

        for (Goods goods : goodsList) {
            list.add(goods.getValue() / goods.getWeight());
        }

        double tempWeight = 0.0;
        while (tempWeight < weight){

            double subWeight = weight - tempWeight;

            double maxValue = Collections.max(list);
            int maxIndex = list.indexOf(maxValue);

            if (goodsList.get(maxIndex).getWeight() <= subWeight){
                tempWeight += goodsList.get(maxIndex).getWeight();
                value += goodsList.get(maxIndex).getValue();
            }else{
                double WEIGHT = goodsList.get(maxIndex).getWeight(); // 2
                if (WEIGHT % subWeight == 0){
                    double div = WEIGHT / subWeight;
                    value += goodsList.get(maxIndex).getWeight() / div;
                    tempWeight += subWeight;
                }
            }

            goodsList.remove(maxIndex);
            list.remove(maxIndex);

            if (tempWeight == weight){
                break;
            }
        }
        return value;
    }

}

