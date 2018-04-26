import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        List<String> stringCommons = new ArrayList<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("T");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");
        stringList.add("Z");

        stringList2.add("A");
        stringList2.add("B");
        stringList2.add("X");
        stringList2.add("D");
        stringList2.add("F");
        stringList2.add("G");
        stringList2.add("T");

        for (int i=0; i<stringList2.size(); i++) {
            for (int j=i; j<stringList.size(); j++) {
                if (stringList2.get(i).equals(stringList.get(j))){
                    stringCommons.add(stringList.get(j));
                }
            }
        }

        System.out.println(stringCommons);




    }

    int computeLCS(char[] seq1, char[] seq2) {
        int N = seq1.length;
        int M = seq2.length;
        int[][] lcs_table = new int[N + 1][M + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if (i == 0 || j == 0)
                    lcs_table[i][j] = 0;
                else if (seq1[i-1] == seq2[j-1])
                    lcs_table[i][j] = 1 + lcs_table[i - 1][j - 1];
                else
                    lcs_table[i][j] = Math.max(lcs_table[i - 1][j], lcs_table[i][j - 1]);
            }
        }
        return lcs_table[N][M];
    }

}
