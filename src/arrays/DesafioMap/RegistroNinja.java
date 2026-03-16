package arrays.DesafioMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegistroNinja {

    Map<String, Ninja> registro;

    public RegistroNinja() {
        registro = new LinkedHashMap<>();
    }

    public void adicionarNinja(String id,Ninja ninja){
        System.out.println("Adicionando Ninja: " + ninja.getNome());
        registro.put(id, ninja);
    }

    public void removerNinja(String id){
        System.out.println("Removendo Ninja: " + registro.get(id).getNome());
        registro.remove(id);
    }

    public void buscarNinja(String id){
        System.out.println("Buscando Ninja: " + id);
        if(registro.containsKey(id)){
            System.out.println("Ninja encontrado: " + registro.get(id).getNome() + " - " + registro.get(id).getPoder() + " - " + registro.get(id).getNivel());
        } else {
            System.out.println("Ninja não encontrado");
        }
    }

    public void mostrarQuantidade() {
        System.out.println("Quantidade de ninjas registrados: " + registro.size());
    }

    public void mostrarNinjas() {
        if (registro.isEmpty()) {
            System.out.println("Nenhum ninja registrado");
        } else {
            System.out.println("=== NINJAS REGISTRADOS ===");
            for (Map.Entry<String, Ninja> entry : registro.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " | " + entry.getValue().getNivel() + " | Poder: " + entry.getValue().getPoder());
            }
        }
    }

}
