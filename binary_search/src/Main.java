import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static String result = "";

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(8);
        integerList.add(1);
        integerList.add(4);
        integerList.add(17);
        integerList.add(21);
        integerList.add(14);
        integerList.add(30);
        integerList.add(22);

        List<Integer> integerListTest = new ArrayList<>();
        integerListTest.add(15);
        integerListTest.add(3);
        integerListTest.add(4);
        integerListTest.add(21);
        integerListTest.add(10);
        integerListTest.add(7);

        Collections.sort(integerList);

        for (int i=0; i<integerListTest.size(); i++){
            binarySearch(integerList, integerListTest.get(i));
            System.out.println(result);
        }

    }

    static void binarySearch(List<Integer> list, int value){
        int middleIndex = ((list.size()+1) / 2) - 1;

        if (list.size() == 0){
            result = "NO"; // value not available
        }else{
            if (value == list.get(middleIndex)){
                result = "YES"; // value available
            }else if (value > list.get(middleIndex)){
                list = list.subList(middleIndex+1, list.size());
                binarySearch(list, value);
            }else{
                list = list.subList(0, middleIndex);
                binarySearch(list, value);
            }
        }
    }

}
