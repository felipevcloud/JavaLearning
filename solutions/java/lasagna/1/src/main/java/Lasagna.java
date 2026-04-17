public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeSpent){
        int timeRemaining = expectedMinutesInOven() - timeSpent;
        return timeRemaining;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeSpent){
        return (expectedMinutesInOven() - remainingMinutesInOven(timeSpent)) + preparationTimeInMinutes(layers);
    }
}
