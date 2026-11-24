import java.util.Random;
import java.util.Scanner;

public class Combate {

    public static boolean iniciar(
            Jogador jogador,
            Inimigo inimigo,
            Scanner scanner) {

        // TODO: Implementar o combate por turnos.
        return false;
    }

    static boolean iniciar(
            Jogador jogador,
            Inimigo inimigo,
            Scanner scanner,
            Random random) {

        // TODO: Implementar o combate com sorteios.
        return false;
    }

    private static Implante escolherHabilidade(
            Jogador jogador,
            Scanner scanner) {

        // TODO: Selecionar uma habilidade equipada.
        return null;
    }

    static boolean usarHabilidade(
            Jogador jogador,
            Inimigo inimigo,
            Implante implante,
            Random random) {

        // TODO: Implementar as habilidades especiais.
        // TODO: Implementar o risco de ciberpsicose.
        // TODO: Implementar a ativacao da Capri.

        return false;
    }

    // Menu demonstrativo do prototipo.
    public static void exibirPrototipo(Scanner scanner) {

        while (scanner.hasNextLine()) {

            System.out.println("\n=== COMBATE ===");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar MaxDoc");
            System.out.println("3 - Usar habilidade especial");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int opcao = Main.lerOpcao(scanner);

            switch (opcao) {

                case 1:
                    System.out.println("Ataque - Em desenvolvimento.");
                    break;

                case 2:
                    System.out.println("MaxDoc - Em desenvolvimento.");
                    break;

                case 3:
                    exibirHabilidades(scanner);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    // Menu demonstrativo das habilidades.
    private static void exibirHabilidades(Scanner scanner) {

        System.out.println("\n=== HABILIDADES (DEMONSTRACAO) ===");
        System.out.println("1 - Sandevistan");
        System.out.println("2 - Mantis Blades");
        System.out.println("3 - Capricorn (Capri)");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        int opcao = Main.lerOpcao(scanner);

        if (opcao >= 1 && opcao <= 3) {
            System.out.println("Habilidade - Em desenvolvimento.");
        } else if (opcao != 0) {
            System.out.println("Opcao invalida.");
        }
    }
}