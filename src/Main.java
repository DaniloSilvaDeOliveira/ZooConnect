import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" ______            _____                             _   ");
        System.out.println("|___  /           /  __ \\                           | |  ");
        System.out.println("   / /  ___   ___ | /  \\/ ___  _ __  _ __   ___  __| | ");
        System.out.println("  / /  / _ \\ / _ \\| |    / _ \\| '_ \\| '_ \\ / _ \\/ __| __|");
        System.out.println("./ /_| (_) | (_) | \\__/\\ (_) | | | | | | |  __/ (__| | ");
        System.out.println("\\_____/\\___/ \\___/ \\____/\\___/|_| |_|_| |_|\\___|\\___|\\__|");
        Thread.sleep(2000);

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Zoológico zoo = new Zoológico();
        int opcode = -1;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|             Menu                  |");
            System.out.println("+-----------------------------------+");
            System.out.println("|     1 - Cadastrar Animal          |");
            System.out.println("|     2 - Atualizar Animal          |");
            System.out.println("|     3 - Listar Animais            |");
            System.out.println("|     4 - Listar Animal             |");
            System.out.println("|     5 - Excluir Animal            |");
            System.out.println("|     0 - Sair                      |");
            System.out.println("+-----------------------------------+\n");
            System.out.println("Digite a opção desejada: ");
            while (true) {
                try {
                    opcode = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, insira um número válido.");
                }
            }
            switch (opcode) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    if(menu.execCadastrarAnimal(zoo)){
                        System.out.println("Animal cadastrado com sucesso!");
                    }else{
                        System.out.println("Ocorreu um erro ao cadastrar o animal.");
                    }
                    break;
                case 2:
                    menu.atualizarAnimal(zoo);
                    break;
                case 3:
                    zoo.listarAnimais();
                    break;
                case 4:
                    System.out.println("Digite o nome do animal que deseja listar: ");
                    Animal animalListado = zoo.listarAnimal(sc.nextLine());
                    System.out.println(animalListado.ToString());
                    
                    break;
                case 5:
                    System.out.println("Digite o nome do animal que deseja excluir: ");
                    Animal animalExcluido = zoo.listarAnimal(sc.nextLine());
                    zoo.removerAnimal(animalExcluido);

                    break;
            }
        } while (opcode != 0);
    }
}