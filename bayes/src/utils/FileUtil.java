package utils;

import pojo.Training;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<Training> readFile(){

        List<Boolean> booleanList = null;
        Training training = null;
        List<Training> trainingList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            while (br.ready()){
                String[] strings = br.readLine().split(" ");
                int size = strings.length;
                booleanList = new ArrayList<>();
                training = new Training();
                for (int i=0; i<size; i++){
                    if (i == (size-1)){
                        training.setType(strings[i]);
                    }else{
                        booleanList.add(Boolean.valueOf(strings[i]));
                    }
                }
                training.setBooleanList(booleanList);
                trainingList.add(training);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trainingList;
    }
}
