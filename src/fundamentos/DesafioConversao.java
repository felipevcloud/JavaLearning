package fundamentos;

import java.util.Scanner;

public class DesafioConversao{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Type your first salary:");
        String firstSalary = input.next().replace(",",".");
        System.out.println("Type your second salary:");
        String secondSalary = input.next().replace(",",".");
        System.out.println("Type your third salary:");
        String thirdSalary = input.next().replace(",",".");

        double salary1 = Double.parseDouble(firstSalary);
        double salary2 = Double.parseDouble(secondSalary);
        double salary3 = Double.parseDouble(thirdSalary);

        System.out.printf("A média dos três salários informados é de: " + (salary1 + salary2 + salary3)/3);
    }
}
