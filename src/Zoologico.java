import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoologico {
    private List<Animal> listaDeAnimais = new ArrayList<Animal>();



    public void adicionarAnimal(Animal animal){
        listaDeAnimais.add(animal);
    }

    public void atualizarAnimal(String nome, String novaEspecie, String novaDieta){
        Scanner sc = new Scanner(System.in);
        Animal animal = listarAnimal(nome);
        if(animal instanceof Ave)
        {
            try{
                Ave animalAve = (Ave) animal;
                System.out.println("Digite o valor da envergadura das asas:  ");
                Double envergadura = Double.parseDouble(sc.nextLine());
                //verifica se o valor da envergadura é válido
                if(envergadura <= 0){
                    throw new Exception("Valor inválido.");
                }
                animalAve.setEnvergaduraDasAsas(envergadura);
                animalAve.setDieta(novaDieta);
                animalAve.setEspecie(novaEspecie);
            }catch(Exception e){
                System.out.println(e.getMessage());
                return;
            }

        }
        else if(animal instanceof Mamifero)
        {
            try{
                Mamifero animalMamifero = (Mamifero) animal;
                System.out.println("Digite a cor da pelagem:  ");
                String corPelagem = sc.nextLine();
                //verifica se a cor da pelagem é válida
                if(corPelagem.matches(".*\\d.*")){
                    throw new Exception("Cor inválida.");
                }
                animalMamifero.setCorPelagem(corPelagem);
                animalMamifero.setDieta(novaDieta);
                animalMamifero.setEspecie(novaEspecie);
            }catch(Exception e){
                System.out.println(e.getMessage());
                return;
            }


        }
        else
        {
            Estilo.cor("Opção inválida.",1);
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
        if(nome.matches(".*\\d.*")){
            Estilo.cor("Nome inválido.",1);
            return null;
        }
        for (Animal animal : listaDeAnimais) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    public void removerAnimal(Animal animal){
        listaDeAnimais.remove(animal);
        System.out.println("\n+--------------------------------------------+");
        Estilo.cor("      "+animal.getNome()+" foi excluido(a) com sucesso!! ",3);
        System.out.println("\n+--------------------------------------------+");
    }

    public void listarAnimais(){

        if (listaDeAnimais.isEmpty()) {
            Estilo.cor("Não há animais no zoológico",1);
            return;
        }else{
            for (Animal animal : listaDeAnimais) {
                System.out.println("=====================================");
                System.out.println(animal.ToString());
            }
        }
    }


}
