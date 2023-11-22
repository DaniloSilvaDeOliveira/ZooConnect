import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Estilo.logo();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Zoologico zoo = new Zoologico();
        int opcode = -1;
        do {
            Thread.sleep(1000);
            System.out.println("+-----------------------------------+");
            System.out.println("|             Menu                  |");
            System.out.println("+-----------------------------------+");
            System.out.println("|     1 - Cadastrar Animal          |");
            System.out.println("|     2 - Atualizar Animal          |");
            System.out.println("|     3 - Listar Animais            |");
            System.out.println("|     4 - Buscar Animal             |");
            System.out.println("|     5 - Excluir Animal            |");
            System.out.println("|     0 - Sair                      |");
            System.out.println("+-----------------------------------+\n");
            System.out.println("Digite a opção desejada: ");
            while (true) {
                try {
                    opcode = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    Estilo.cor("+-----------------------------------------+",1);
                    Estilo.cor("|  Por favor, insira um número válido. ⚠️ |",1);
                    Estilo.cor("+-----------------------------------------+",1);
                }
            }
            switch (opcode) {
                case 0:

                Estilo.limparTela();

                Thread.sleep(1000);
                System.out.println("\t\tProjeto POO - 4° Análise Desenvolvimento de Sistemas");

                Estilo.cor("\t +-------------------------------------------------+",2);
                Estilo.cor("\t |                       INTEGRANTES               |",2);
                Estilo.cor("\t +-------------------------------------------------+",2);
                    Thread.sleep(500);
                Estilo.cor("\t |                       Danilo Silva              |",2);
                    Thread.sleep(500);
                Estilo.cor("\t |                       Fábio Passos              |",2);
                    Thread.sleep(500);
                Estilo.cor("\t |                       Juliana Lopes             |",2);
                    Thread.sleep(500);
                Estilo.cor("\t |                       Larissa Gabrielle         |",2);
                    Thread.sleep(500);
                Estilo.cor("\t |                       Luma Souza                |",2);
                Estilo.cor("\t +-------------------------------------------------+",2);
                    Thread.sleep(500);

                System.out.println("\t\t\t\t\t  Saindo...");
                    break;
                case 1:
                    if(menu.execCadastrarAnimal(zoo)){
                        Estilo.cor("\n+-----------------------------------------+",2);
                        Estilo.cor("|      Animal cadastrado com sucesso! ✅  |", 2);
                        Estilo.cor("+-----------------------------------------+",2);
                    }
                    break;
                case 2:
                    menu.atualizarAnimal(zoo);
                    break;
                case 3:
                    Estilo.cor("\n+-----------------------------------------+",3);
                    Estilo.cor("|      Lista de Animais cadastrados 📃    |", 3);
                    Estilo.cor("+-----------------------------------------+\n",3);
                    zoo.listarAnimais();



                    break;
                case 4:
                try{
                        System.out.println("Digite o nome do animal que deseja listar: ");
                        String nome = sc.nextLine();
                        //verifica se o animal existe
                        if(zoo.listarAnimal(nome) == null){
                            throw new Exception("Animal não encontrado.");
                        }else{
                            Animal animalListado = zoo.listarAnimal(nome);
                            System.out.println(animalListado.ToString());
                        } 
                        break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    break;
                }
                case 5:
                    System.out.println("Digite o nome do animal que deseja excluir: ");
                    Animal animalExcluido = zoo.listarAnimal(sc.nextLine());
                    zoo.removerAnimal(animalExcluido);

                    break;
                default:
                    Estilo.cor("\n+-----------------------------------------+",1);
                    Estilo.cor("|         Digite um número válido ⚠️      |",1);
                    Estilo.cor("+-----------------------------------------+",1);

            }
        } while (opcode != 0);
    }

}