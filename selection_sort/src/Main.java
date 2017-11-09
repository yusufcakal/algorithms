import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(0);
        list.add(7);

        int temp;

        for (int i=0; i<list.size(); i++){
            int min = i;
            for (int j=i; j<list.size(); j++){
                if (list.get(j) < list.get(min)){
                    min = j; // en küçük değerin indisini bul.
                }
            }
            temp = list.get(i); // listenin başında ki değişkeni sakla.
            list.set(i, list.get(min)); // en küçük değeri listenin başına at.
            list.set(min, temp); // listenin başındaki veriyi en küçük değerde ki verinin yerine koy..
        }

        System.out.println(list);

    }

}
