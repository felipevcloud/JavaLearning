package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();
        data1.day = 2;
        data1.month = 10;
        data1.year = 1997;

        System.out.println(data1.formattedDate());

        Data data2 = new Data();
        data2.day = 6;
        data2.month = 10;
        data2.year = 2018;

        System.out.println(data2.formattedDate());


    }
}
