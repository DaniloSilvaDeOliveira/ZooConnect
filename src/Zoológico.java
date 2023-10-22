import java.util.ArrayList;
import java.util.List;

public class Zoológico {
    private List<Animal> listaDeAnimais = new ArrayList<Animal>();

    public void adicionarAnimal(Animal animal){
        listaDeAnimais.add(animal);
    }

    public void removerAnimal(Animal animal){
        listaDeAnimais.remove(animal);
    }

    public void listarAnimais(){

        if (listaDeAnimais.isEmpty()) {
            System.out.println("Não há animais no zoológico");
            return;
        }else{
            for (Animal animal : listaDeAnimais) {
                System.out.println("=====================================");
                System.out.println(animal.ToString());
            }
        }
    }

}
