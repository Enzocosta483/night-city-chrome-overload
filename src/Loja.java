import java.util.Scanner;

public class Loja {

    private static void comprarChrome(
            Jogador jogador,
            Scanner scanner) {

        // TODO: Implementar a compra de implantes.
    }

    private static void gerenciarChrome(
            Jogador jogador,
            Scanner scanner) {

        // TODO: Implementar a instalacao e remocao.
    }

    // Menu demonstrativo da loja.
    public static void abrir(
            Jogador jogador,
            Scanner scanner) {

        while (scanner.hasNextLine()) {

            System.out.println("\n=== RIPPERDOC / LOJA ===");

            System.out.println("1 - Comprar implante");
            System.out.println("2 - Equipar ou retirar implante");
            System.out.println("3 - Comprar MaxDoc");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int opcao = Main.lerOpcao(scanner);

            switch (opcao) {

                case 1:
                    exibirCatalogo();
                    break;

                case 2:
                    System.out.println(
                            "Gerenciamento - Em desenvolvimento."
                    );
                    break;

                case 3:
                    System.out.println(
                            "Compra de MaxDoc - Em desenvolvimento."
                    );
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

    // Exibe os implantes planejados.
    private static void exibirCatalogo() {

        System.out.println("\n=== CATALOGO DE IMPLANTES ===");

        Implante[] catalogo = Implante.values();

        for (int i = 0; i < catalogo.length; i++) {

            System.out.println(
                    (i + 1) + " - " + catalogo[i].getNome()
            );
        }

        System.out.println("\nCompras - Em desenvolvimento.");
    }
}