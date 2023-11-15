import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoológico {
    private List<Animal> listaDeAnimais = new ArrayList<Animal>();

    public void adicionarAnimal(Animal animal){
        listaDeAnimais.add(animal);
    }

    public void atualizarAnimal(String nome, String novaEspecie, String novaDieta){
        Scanner sc = new Scanner(System.in);
        Animal animal = listarAnimal(nome);
        if(animal instanceof Ave)
        {
            Ave animalAve = (Ave) animal;
            System.out.println("Digite o valor da envergadura das asas:  ");
            Double envergadura = Double.parseDouble(sc.nextLine());
            animalAve.setEnvergaduraDasAsas(envergadura);
            animalAve.setDieta(novaDieta);
            animalAve.setEspécie(novaEspecie);

        }
        else if(animal instanceof Mamifero)
        {
            Mamifero animalMamifero = (Mamifero) animal;
            System.out.println("Digite a cor da pelagem:  ");
            String corPelagem = sc.nextLine();
            animalMamifero.setCorPelagem(corPelagem);
            animalMamifero.setDieta(novaDieta);
            animalMamifero.setEspécie(novaEspecie);

        }
        else
        {
            System.out.println("Opção inválida.");
        }
    }

    public void substituirAnimal(String nome, Animal novoAnimal) {
        for (int i = 0; i < listaDeAnimais.size(); i++) {
            if (listaDeAnimais.get(i).getNome().equals(nome)) {
                listaDeAnimais.set(i, novoAnimal);
                break;
            }
        }
    }

    public Animal listarAnimal(String nome){
        for (Animal animal : listaDeAnimais) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
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
