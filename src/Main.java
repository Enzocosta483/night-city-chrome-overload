import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n================================");
            System.out.println("   NIGHT CITY: CHROME OVERLOAD");
            System.out.println("================================");
            System.out.println("       PROTOTIPO ESTRUTURAL");
            System.out.println("================================");

            System.out.println("1 - Novo jogo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (!scanner.hasNextLine()) {
                break;
            }

            int opcao = lerOpcao(scanner);

            if (opcao == 1) {

                jogar(scanner);

            } else if (opcao == 0) {

                System.out.println("Encerrando o jogo.");
                break;

            } else {

                System.out.println("Opcao invalida.");
            }
        }

        scanner.close();
    }

    private static void jogar(Scanner scanner) {

        System.out.print("Digite seu nome: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        String nome = scanner.nextLine();

        // Instancia o jogador.
        Jogador jogador = new Jogador(nome);

        // Instancia os inimigos planejados.
        ArrayList<Inimigo> inimigos = new ArrayList<>();

        inimigos.add(new Mercenario());
        inimigos.add(new SoldadoCorporativo());
        inimigos.add(new AgenteElite());

        // Menu demonstrativo do jogo.
        while (true) {

            System.out.println("\n=== NIGHT CITY ===");
            System.out.println("Jogador: " + jogador.getNome());

            System.out.println("1 - Combate");
            System.out.println("2 - Loja / Ripperdoc");
            System.out.println("3 - Visualizar inimigos");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");

            if (!scanner.hasNextLine()) {
                return;
            }

            int opcao = lerOpcao(scanner);

            switch (opcao) {

                case 1:
                    Combate.exibirPrototipo(scanner);
                    break;

                case 2:
                    Loja.abrir(jogador, scanner);
                    break;

                case 3:
                    System.out.println("\n=== INIMIGOS ===");

                    for (Inimigo inimigo : inimigos) {
                        System.out.println(inimigo.getNome());
                    }

                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    // Leitura das opcoes dos menus.
    static int lerOpcao(Scanner scanner) {

        if (!scanner.hasNextLine()) {
            return -1;
        }

        try {

            return Integer.parseInt(
                    scanner.nextLine().trim()
            );

        } catch (NumberFormatException e) {

            return -1;
        }
    }
}