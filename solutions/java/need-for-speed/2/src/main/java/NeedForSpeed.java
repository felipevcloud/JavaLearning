class NeedForSpeed {

    int speed;
    int batteryDrain;
    int distance = 0;
    int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
            return (this.battery < batteryDrain);
        
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!batteryDrained()){
            this.battery -= this.batteryDrain;
            this.distance += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}

class RaceTrack {

    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
            if(car.distanceDriven() == this.distance){
                return true;
            }
        }
        return false;
    }
}
