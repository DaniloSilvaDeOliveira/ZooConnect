import java.util.Scanner;


public class Menu {

    boolean execCadastrarAnimal(Zoologico zoo){
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do animal: ");
            String nome = sc.nextLine();
            //verifica se o nome tem números ou se já está cadastrado no zoo
            if(nome.matches(".*\\d.*")){
                throw new Exception("Nome inválido.");
            }else if(zoo.listarAnimal(nome) != null){
                throw new Exception("Animal já cadastrado.");
            }

            System.out.println("Digite a especie do animal:  ");
            String especie= sc.nextLine();
            //verifica se a especie tem números
            if(especie.matches(".*\\d.*")){
                throw new Exception("Espécie inválida.");
            }

            System.out.println("Digite a dieta do animal:  ");
            String dieta = sc.nextLine();
            //verifica se a dieta tem números
            if(dieta.matches(".*\\d.*")){
                throw new Exception("Dieta inválida.");
            }

            System.out.println("Digite qual animal vai ser cadastrado: ");
            System.out.println("1 - Ave");
            System.out.println("2 - Mamifero");
            int opt;
            while (true) {
                try {
                    opt = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, insira um número válido.");
                }
            }

            switch (opt) {
                case 1:
                    System.out.println("Digite o valor da envergadura das asas:  ");
                    double envergadura = Double.parseDouble(sc.nextLine());
                    //verifica se a envergadura tem letras
                    if(Double.isNaN(envergadura)){
                        throw new Exception("Envergadura inválida.");
                    }else if(envergadura < 0){
                        throw new Exception("Envergadura deve ter um valor positivo.");
                    }

                    Ave ave = new Ave(nome, especie, dieta, envergadura);
                    zoo.adicionarAnimal(ave);
                    return true;
                    case 2: 
                        System.out.println("Digite a cor da pelagem:  ");
                        String corPelagem = sc.nextLine();
                        //verifica se a cor da pelagem tem números
                        if(corPelagem.matches(".*\\d.*")){
                            throw new Exception("Cor da pelagem inválida.");
                        }else if(corPelagem.isEmpty()){
                            throw new Exception("Cor da pelagem não pode ser vazia");
                        }
                        Mamifero mamifero = new Mamifero(nome, especie, dieta, corPelagem);
                        zoo.adicionarAnimal(mamifero);
                        return true;
                    default:
                        System.out.println("Opção inválida.");
                        return false;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }

    void atualizarAnimal(Zoologico zoo) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o nome do animal que deseja atualizar: ");
            String nome = sc.nextLine();

            // Verifica se o nome é inválido (contém números ou caracteres especiais)
            if (!nome.matches("[a-zA-Z]+")) {
                throw new Exception("Nome inválido.");
            }

            // Verifica se o animal já está cadastrado
            Animal animal = zoo.listarAnimal(nome);
            if (animal == null) {
                throw new Exception("Animal não encontrado.");
            }

            if (animal instanceof Ave) {
                Ave animalAve = (Ave) animal;
                String nomeOld = animalAve.getNome();
                animalAve = menuAve(animalAve, zoo);
                zoo.substituirAnimal(nomeOld, animalAve);
            } else if (animal instanceof Mamifero) {
                Mamifero animalMamifero = (Mamifero) animal;
                String nomeOld = animalMamifero.getNome();
                animalMamifero = menuMamifero(animalMamifero, zoo);
                zoo.substituirAnimal(nomeOld, animalMamifero);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    Ave menuAve(Ave ave, Zoologico zoo) throws InterruptedException {
       Scanner sc = new Scanner(System.in);
       int opt;
    do{
        Thread.sleep(4000);
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
                try{
                    System.out.println("Digite o novo nome: ");
                    String nome = sc.nextLine();
                    //verifica se o nome tem números ou se já está cadastrado no zoo
                    if(nome.matches(".*\\d.*")){
                        throw new Exception("Nome inválido.");
                    }else if(zoo.listarAnimal(nome) != null){
                        throw new Exception("Animal já cadastrado.");
                    }
                    ave.setNome(nome);
                    break;
                    
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        return null;
                    }
                case 2:
                try{
                        System.out.println("Digite a nova espécie: ");
                        String especie = sc.nextLine();
                        //verifica se a especie tem números
                        if(especie.matches(".*\\d.*")){
                            throw new Exception("Espécie inválida.");
                        }
                        ave.setEspecie(especie);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        return null;
                    }
                case 3:
                try{
                        System.out.println("Digite a nova dieta: ");
                        String dieta = sc.nextLine();
                        //verifica se a dieta tem números
                        if(dieta.matches(".*\\d.*")){
                            throw new Exception("Dieta inválida.");
                        }

                        ave.setDieta(dieta);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        return null;
                    }
                case 4:
                try{
                    System.out.println("Digite a nova envergadura das asas: ");
                    double envergadura = Double.parseDouble(sc.nextLine());
                    //verifica se a envergadura tem letras
                    if(Double.isNaN(envergadura)){
                        throw new Exception("Envergadura inválida.");
                    }else if(envergadura < 0){
                        throw new Exception("Envergadura deve ter um valor positivo.");
                    }
                    ave.setEnvergaduraDasAsas(envergadura);
                    break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        return null;
                    }
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
    }while(opt != 0);
        return ave;
    }

    Mamifero menuMamifero(Mamifero mamifero, Zoologico zoo) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opt = 1;
    do{
        Thread.sleep(4000);
        System.out.println("+-----------------------------------------+");
        Estilo.cor("       Animal: "+ mamifero.getNome()+"       ",3);
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
                try{
                    System.out.println("Digite o novo nome: ");
                    String nome = sc.nextLine();
                    //verifica se o nome tem números ou se já está cadastrado no zoo
                    if(nome.matches(".*\\d.*")){
                        throw new Exception("Nome inválido.");
                    }else if(zoo.listarAnimal(nome) != null){
                        throw new Exception("Animal já cadastrado.");
                    }

                    mamifero.setNome(nome);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
                case 2:
                try{
                    System.out.println("Digite a nova espécie: ");
                    String especie = sc.nextLine();
                    //verifica se a especie tem números
                    if(especie.matches(".*\\d.*")){
                        throw new Exception("Espécie inválida.");
                    }
                    mamifero.setEspecie(especie);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
                case 3:
                try{
                    System.out.println("Digite a nova dieta: ");
                    String dieta = sc.nextLine();
                    //verifica se a dieta tem números
                    if(dieta.matches(".*\\d.*")){
                        throw new Exception("Dieta inválida.");
                    }
                    mamifero.setDieta(dieta);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
                case 4:
                try{
                    System.out.println("Digite a nova pelagem: ");
                    String pelagem = sc.nextLine();
                    //verifica se a pelagem tem números
                    if(pelagem.matches(".*\\d.*")){
                        throw new Exception("Pelagem inválida.");
                    }
                    mamifero.setCorPelagem(pelagem);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
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