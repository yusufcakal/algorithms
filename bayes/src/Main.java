import pojo.Training;
import utils.FileUtil;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Training sampleData = Training.getSampleData();
        List<Training> trainingList = FileUtil.readFile();

        List<Training> trainingListMan = new ArrayList<>();
        List<Training> trainingListWoman = new ArrayList<>();

        // MAN

        for (int i=0; i<trainingList.size(); i++){
            if (trainingList.get(i).getType().equals("man")){
                trainingListMan.add(trainingList.get(i));
            }else{
                trainingListWoman.add(trainingList.get(i));
            }
        }

        List<Integer> countListMan = new ArrayList<>(sampleData.getBooleanList().size());
        countListMan.add(0);
        countListMan.add(0);
        countListMan.add(0);
        countListMan.add(0);

        for (int j=0; j<trainingListMan.size(); j++){
            for (int k=0; k<trainingListMan.get(j).getBooleanList().size(); k++){
                if (trainingListMan.get(j).getBooleanList().get(k) == sampleData.getBooleanList().get(k)){
                    countListMan.set(k, countListMan.get(k)+1);
                }
            }
        }

        double manResult = 1;

        for (Integer count : countListMan) {
            manResult *= (count / (double) trainingListMan.size());
        }

        manResult = manResult * ((double) trainingListMan.size() / (double)trainingList.size());

        // WOMAN

        List<Integer> countListWoman = new ArrayList<>(4);
        countListWoman.add(0);
        countListWoman.add(0);
        countListWoman.add(0);
        countListWoman.add(0);

        for (int j=0; j<trainingListWoman.size(); j++){
            for (int k=0; k<trainingListWoman.get(j).getBooleanList().size(); k++){ // her defasında 4 kere dönüyor
                if (trainingListWoman.get(j).getBooleanList().get(k) == sampleData.getBooleanList().get(k)){
                    countListWoman.set(k, countListWoman.get(k)+1);
                }
            }
        }

        double womanResult = 1;

        for (Integer count : countListWoman) {
            womanResult *= (count / (double) trainingListWoman.size());
        }

        womanResult = womanResult * ((double) trainingListWoman.size() / (double)trainingList.size());

        if (manResult > womanResult){
            sampleData.setType("man");
        }else{
            sampleData.setType("woman");
        }

    }
}
