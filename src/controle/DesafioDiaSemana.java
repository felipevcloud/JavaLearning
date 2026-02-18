package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        String day;
        Scanner input = new Scanner(System.in);

        System.out.print("Type the day of the week: ");
        day = input.next();

        if((day.equals("Sunday")) || (day.equals("sunday"))){
            System.out.print("1");
        }
        else if((day.equals("Monday")) || (day.equals("monday"))){
            System.out.print("2");
        }
        else if((day.equals("Tuesday")) || (day.equals("tuesday"))){
            System.out.print("3");
        }
        else if((day.equals("Wednesday")) || (day.equals("wednesday"))){
            System.out.print("4");
        }
        else if((day.equals("Thursday")) || (day.equals("thursday"))){
            System.out.print("5");
        }
        else if((day.equals("Friday")) || (day.equals("friday"))){
            System.out.print("6");
        }
        else if((day.equals("Saturday")) || (day.equals("saturday"))){
            System.out.print("7");
        }
        else {
            System.out.println("Invalid Day");
        }
    }
}
