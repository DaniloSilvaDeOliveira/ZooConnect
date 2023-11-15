import java.util.Scanner;

public class Menu {

    boolean execCadastrarAnimal(Zoológico zoo){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        String nome = sc.nextLine();
        System.out.println("Digite a especie do animal:  ");
        String especie= sc.nextLine();
        System.out.println("Digite a dieta do animal:  ");
        String dieta = sc.nextLine();


        System.out.println("Digite qual animal vai ser cadastrado: ");
        System.out.println("1 - Ave");
        System.out.println("2 - Mamifero");
        int opt = -1;
        while (true) {
            try {
                opt = Integer.parseInt(sc.nextLine());
                break;  // Break the loop if the number is valid
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }

        switch (opt) {
            case 1:
                System.out.println("Digite o valor da envergadura das asas:  ");
                Double envergadura = Double.parseDouble(sc.nextLine());

                Ave ave = new Ave(nome, especie, dieta, envergadura);
                zoo.adicionarAnimal(ave);
                return true;
                case 2: 
                    System.out.println("Digite a cor da pelagem:  ");
                    String corPelagem = sc.nextLine();
                    Mamifero mamifero = new Mamifero(nome, especie, dieta, corPelagem);
                    zoo.adicionarAnimal(mamifero);
                    return true;
                default:
                    System.out.println("Opção inválida.");
                    return false;
        }
    }

    void atualizarAnimal(Zoológico zoo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do animal que deseja atualizar: ");
        String nome = sc.nextLine();
        Animal animal = zoo.listarAnimal(nome);
        if(animal instanceof Ave)
        {
            Ave animalAve = (Ave) animal;
            String nomeOld = animalAve.getNome();
            animalAve = menuAve(animalAve);
            zoo.substituirAnimal(nomeOld, animalAve);
        }
        else if(animal instanceof Mamifero)
        {
            Mamifero animalMamifero = (Mamifero) animal;
            String nomeOld = animalMamifero.getNome();
            animalMamifero = menuMamifero(animalMamifero);
            zoo.substituirAnimal(nomeOld, animalMamifero);
        }
    }

    Ave menuAve(Ave ave){
       Scanner sc = new Scanner(System.in);
       int opt = 1;
    do{
       System.out.println("+-----------------------------------------+");
       System.out.println("       Animal: "+ ave.getNome()+"          ");
       System.out.println("+-----------------------------------------+");
       System.out.println("|     1 - Atualizar Nome                  |");
       System.out.println("|     2 - Atualizar Espécie               |");
       System.out.println("|     3 - Atualizar Dieta                 |");
       System.out.println("|     4 - Atualizar Envergadura Das Asa   |");
       System.out.println("|     0 - Sair                            |");
       System.out.println("+-----------------------------------------+\n");
       System.out.println(ave.ToString());
       System.out.println("Digite a opção desejada: ");
        while (true) {
            try {
                opt = Integer.parseInt(sc.nextLine());
                break;
            } catch(NumberFormatException e) {
                System.out.println("Por favor digite um número válido");
            }
        }
            switch(opt){
                case 1:
                    System.out.println("Digite o novo nome: ");
                    ave.setNome(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Digite a nova espécie: ");
                    ave.setEspécie( sc.nextLine());
                case 3:
                    System.out.println("Digite a nova dieta: ");
                    ave.setDieta( sc.nextLine());
                    break;
                case 4:
                    System.out.println("Digite a nova envergadura das asas: ");
                    ave.setEnvergaduraDasAsas(Double.parseDouble(sc.nextLine()));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
    }while(opt != 0);
        return ave;
    }

    Mamifero menuMamifero(Mamifero mamifero){
        Scanner sc = new Scanner(System.in);
        int opt = 1;
    do{
        System.out.println("+-----------------------------------------+");
        System.out.println("       Animal: "+ mamifero.getNome()+"       ");
        System.out.println("+-----------------------------------------+");
        System.out.println("|     1 - Atualizar Nome                  |");
        System.out.println("|     2 - Atualizar Espécie               |");
        System.out.println("|     3 - Atualizar Dieta                 |");
        System.out.println("|     4 - Atualizar Pelagem               |");
        System.out.println("|     0 - Sair                            |");
        System.out.println("+-----------------------------------------+\n");
        System.out.println(mamifero.ToString());
        System.out.println("Digite a opção desejada: ");
        while (true) {
            try {
                opt = Integer.parseInt(sc.nextLine());
                break; 
            } catch(NumberFormatException e) {
                System.out.println("Por favor digite um número válido");
            }
        }
            switch(opt){
                case 1:
                    System.out.println("Digite o novo nome: ");
                    mamifero.setNome(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Digite a nova espécie: ");
                    mamifero.setEspécie(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Digite a nova dieta: ");
                    mamifero.setDieta(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Digite a nova pelagem: ");
                    mamifero.setCorPelagem(sc.nextLine());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

    }while(opt != 0);
    return mamifero;
    }
}