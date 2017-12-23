import java.util.*;

public class Main {

    public static void main(String[] args) {
        AprioriFrequentItemsetGenerator<String> generator =
                new AprioriFrequentItemsetGenerator<>();

        List<Set<String>> itemsetList = new ArrayList<>();

        itemsetList.add(new HashSet<>(Arrays.asList("a", "b")));
        itemsetList.add(new HashSet<>(Arrays.asList("b", "c", "d")));
        itemsetList.add(new HashSet<>(Arrays.asList("a", "c", "d", "e")));
        itemsetList.add(new HashSet<>(Arrays.asList("a", "d", "e")));
        itemsetList.add(new HashSet<>(Arrays.asList("a", "b", "c")));

        itemsetList.add(new HashSet<>(Arrays.asList("a", "b", "c", "d")));
        itemsetList.add(new HashSet<>(Arrays.asList("a")));
        itemsetList.add(new HashSet<>(Arrays.asList("a", "b", "c")));
        itemsetList.add(new HashSet<>(Arrays.asList("a", "b", "d")));
        itemsetList.add(new HashSet<>(Arrays.asList("b", "c", "e")));

        FrequentItemsetData<String> data = generator.generate(itemsetList, 0.3);
        int i = 1;

        for (Set<String> itemset : data.getFrequentItemsetList()) {
            System.out.printf("%2d: %9s, support: %1.1f\n",
                    i++,
                    itemset,
                    data.getSupport(itemset));
        }
    }
}
