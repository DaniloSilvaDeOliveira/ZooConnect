public class Estilo {
    public static void cor(String texto, int color){
        String reset = "\u001B[0m"; // Reset de estilo
        String red = "\u001B[31m";   // Vermelho
        String green = "\u001B[32m"; // Verde
        String yellow = "\u001B[33m"; // Amarelo
        String blue = "\u001B[34m";   // Azul
        if (color == 1){
            System.out.println(red+ texto+ red);
            System.out.printf(reset);
        } else if (color == 2) {
            System.out.println(green+ texto+ green);
            System.out.printf(reset);
        } else if (color == 3) {
            System.out.println(yellow+ texto+ yellow);
            System.out.printf(reset);
        }else if (color ==4){
            System.out.println(blue+ texto+ blue);
            System.out.printf(reset);
        }
    }

    public static  void logo () throws InterruptedException {
        Estilo.cor(" ______            _____                             _   ",4);
        Estilo.cor("|___  /           /  __ \\                           | |  ",4);
        Estilo.cor("   / /  ___   ___ | /  \\/ ___  _ __  _ __   ___  ___| |_ ",4);
        Estilo.cor("  / /  / _ \\ / _ \\| |    / _ \\| '_ \\| '_ \\ / _ \\/ __| __|",4);
        Estilo.cor("./ /__| (_) | (_) | \\__/\\ (_) | | | | | | |  __/ (__| |_ ",4);
        Estilo.cor("\\_____/\\___/ \\___/ \\____/\\___/|_| |_|_| |_|\\___|\\___|\\__|",4);
        Thread.sleep(2000);
    }

    public static void limparTela() {
        for (int i = 0; i < 20; ++i) System.out.println();
    }


}
