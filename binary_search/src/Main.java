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
        integerListTest.add(4);
        integerListTest.add(8);
        integerListTest.add(21);
        integerListTest.add(10);
        integerListTest.add(7);

        for (int i=0; i<integerListTest.size(); i++){
            withOutSortAndBinary(integerList, integerListTest.get(i));
            System.out.println(result);
        }

        System.out.println("------------");


        Collections.sort(integerList);

        for (int i=0; i<integerListTest.size(); i++){
            binarySearch(integerList, integerListTest.get(i));
            System.out.println(result);
        }

    }

    static void withOutSortAndBinary(List<Integer> list, int value){
        boolean flag = false;
        for (int i=0; i<list.size(); i++){
            if (list.get(i) == value){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }

        if (flag){
            result = "VAR";
        }else{
            result = "YOK";
        }

    }

    static void binarySearch(List<Integer> list, int value){
        int middleIndex = ((list.size()+1) / 2) - 1;
        if (list.size() == 0){
            result = "YOK";
        }else{
            if (value == list.get(middleIndex)){
                result = "VAR";
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
