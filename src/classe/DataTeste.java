package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();
        data1.day = 2;
        data1.month = 10;
        data1.year = 1997;

        System.out.printf("%d/%d/%d\n", data1.day, data1.month, data1.year);

        Data data2 = new Data();
        data2.day = 6;
        data2.month = 10;
        data2.year = 2018;

        System.out.printf("%d/%d/%d", data2.day, data2.month, data2.year);


    }
}
