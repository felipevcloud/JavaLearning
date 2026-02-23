package classe;

public class Pessoa {

    String name;
    double weight;

    Pessoa(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    void comer(Comida comida){
        this.weight += comida.weight;
    }
}
