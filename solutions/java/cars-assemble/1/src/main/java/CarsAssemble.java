public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsPerHour;
        if (speed >=0 && speed <= 4){
            carsPerHour = 221 * speed;
            return carsPerHour;
        } else if (speed >=5 && speed <= 8){
            carsPerHour = 221 * speed;
            return carsPerHour * 0.9;
        } else if (speed == 9) {
            carsPerHour = 221 * speed;
            return carsPerHour * 0.8;
        } else {
            carsPerHour = 221 * speed;
            return carsPerHour * 0.77;
        }
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
