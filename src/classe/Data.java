package classe;

public class Data {

    int day, month, year;

    Data(){
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String formattedDate (){
        return this.day + "/" + this.month + "/" + this.year;
    }

}
