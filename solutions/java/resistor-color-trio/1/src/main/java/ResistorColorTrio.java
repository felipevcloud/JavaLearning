import java.util.*;

class ResistorColorTrio {

    private final String[] bandColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    private final String[] metrics = {" ", " kilo", " mega", " giga"};
    
    String label(String[] colors) {
        int metricIndex = 0;
        long code = (Arrays.asList(bandColors).indexOf(colors[0]) * 10) + Arrays.asList(bandColors).indexOf(colors[1]);
        
        for(int i = 0; i < Arrays.asList(bandColors).indexOf(colors[2]); i++){
            code = code * 10;
        }

        while(code > 0 && code%1000 == 0 && metricIndex < metrics.length - 1){
            code = code/1000;
            metricIndex++;
        }

        return Long.toString(code) + metrics[metricIndex] + "ohms";
    }
}