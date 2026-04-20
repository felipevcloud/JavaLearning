public class JedliksToyCar {

    int meters = 0;
    int percentage = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(this.percentage != 0){
            return "Battery at " + percentage + "%";
        } else {
            return "Battery empty";
        }
        
    }

    public void drive() {
        if(this.percentage != 0){
            this.meters += 20;
            this.percentage -=1;
        }

    }
}
