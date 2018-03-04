package pojo;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Coordinate> getData(){

        List<Coordinate> coordinateList = new ArrayList<>();

        Coordinate coordinate1 = new Coordinate(1,4, true);
        Coordinate coordinate2 = new Coordinate(3,4, true);

        Coordinate coordinate3 = new Coordinate(7,4, false);
        Coordinate coordinate4 = new Coordinate(7,7, false);


        coordinateList.add(coordinate1);
        coordinateList.add(coordinate2);
        coordinateList.add(coordinate3);
        coordinateList.add(coordinate4);

        return coordinateList;

    }

}
