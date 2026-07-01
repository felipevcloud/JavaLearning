import java.util.*;

class HighScores {

    List<Integer> scoreList = new ArrayList<>();
    
    public HighScores(List<Integer> highScores) {
        this.scoreList = highScores;
    }

    List<Integer> scores() {
        return scoreList;
    }

    Integer latest() {
        return scoreList.get(scoreList.size() - 1);
    }

    Integer personalBest() {
        int best = 0;
        for(int entry : scoreList){
            if(entry > best){
                best = entry;
            }
        }
        return best;
    }

    List<Integer> personalTopThree() {
        List<Integer> copy = new ArrayList<>(scoreList);
        copy.sort(Comparator.reverseOrder());
        for(int i = scoreList.size() - 1; i > 2 ; i--){
            copy.remove(i);
        }
        return copy;
    }
}
