import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class DnDCharacter {

    Random random = new Random();
    private final int strenght = ability(rollDice());
    private final int dexterity = ability(rollDice());
    private final int constitution = ability(rollDice());
    private final int intelligence = ability(rollDice());
    private final int wisdom = ability(rollDice());
    private final int charisma = ability(rollDice());
    
    int ability(List<Integer> scores) {
        int sum = 0;
        int min = 6;

        for (int score : scores) {
            sum += score;
            min = Math.min(min, score);
        }

        return sum - min;
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            int diceRoll = random.nextInt(6) + 1;
            scores.add(diceRoll);
        }
        return scores;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10)/2.0);
    }

    int getStrength() {
        return strenght;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
