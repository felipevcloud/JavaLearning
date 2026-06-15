class Darts {
    int score(double xOfDart, double yOfDart) {
        double d = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        if(d <= 1){
            return 10;
        } else if (d > 1 && d <= 25) {
            return 5;
        } else if (d > 25 && d <= 100) {
            return 1;
        }
        return 0;
    }
}