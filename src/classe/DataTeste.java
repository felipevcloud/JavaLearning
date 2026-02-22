package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();

        System.out.println(data1.formattedDate());

        Data data2 = new Data(2, 10, 1997);

        System.out.println(data2.formattedDate());


    }
}
