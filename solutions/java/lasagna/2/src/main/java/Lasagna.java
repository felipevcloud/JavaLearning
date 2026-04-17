public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int timeSpent){
        int timeRemaining = expectedMinutesInOven() - timeSpent;
        return timeRemaining;
    }

    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }

    public int totalTimeInMinutes(int layers, int timeSpent){
        return (expectedMinutesInOven() - remainingMinutesInOven(timeSpent)) + preparationTimeInMinutes(layers);
    }
}
