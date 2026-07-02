import java.util.*;

class ResistorColorDuo {

    private final String[] bandColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    int value(String[] colors) {
        return Integer.parseInt(Integer.toString(Arrays.asList(bandColors).indexOf(colors[0])) + Integer.toString(Arrays.asList(bandColors).indexOf(colors[1])));
    }
}