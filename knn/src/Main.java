import pojo.Coordinate;
import pojo.Data;
import pojo.Result;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int k = 2;

         List<Coordinate> coordinateList = Data.getData();
         List<Result> distanceList = new ArrayList<>();

         Coordinate coordinate5 = new Coordinate(3,7);


        for (Coordinate coordinate : coordinateList) {
            double x = coordinate.getX() - coordinate5.getX();
            x = Math.pow(x, 2);
            double y = coordinate.getY() - coordinate5.getY();
            y = Math.pow(y, 2);

            Result result = new Result(Math.sqrt(x+y), coordinate.isCircle());
            distanceList.add(result);

        }

        /**
         * Listeyi distance değişkene göre sıralar ve buna göre en yakın değerlerin hangi tip olduğu belli olur.
         */
        Collections.sort(distanceList, new Comparator<Result>() {
            @Override
            public int compare(Result o1, Result o2) {
                return Double.compare(o1.getDistance(), o2.getDistance());
            }
        });

        int circleSum = 0, notCircleSum = 0;
        for (int i=0; i<k; i++){
            if (distanceList.get(i).isFlag()){
                circleSum++;
            }else{
                notCircleSum++;
            }
        }

        /**
         * Dairesel olan gruba mı daha yakın yoksa dairesel olmayana mı ?
         */
        if (circleSum > notCircleSum){
            coordinate5.setCircle(true);
        }else{
            coordinate5.setCircle(false);
        }

        coordinateList.add(coordinate5);

        System.out.println(coordinateList);

    }
}
